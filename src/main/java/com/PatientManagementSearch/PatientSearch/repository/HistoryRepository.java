package com.PatientManagementSearch.PatientSearch.repository;

import com.PatientManagementSearch.PatientSearch.entity.History;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HistoryRepository extends CrudRepository<History, Integer> {

    @Query(value = "select * from history_search where patient_id=?1", nativeQuery = true)
    List<History> getPatientsHistory(int patientId);

    @Query(value = "select * from history_search", nativeQuery = true)
    List<History> getHistory();

//    @Query(value = "select * from history_search where month=?1", nativeQuery = true)
//    List<History> getByMonth(String month);
//
//    @Query(value = "select * from history_search where issue=?1", nativeQuery = true)
//    List<History> getByIssue(String issue);
}
