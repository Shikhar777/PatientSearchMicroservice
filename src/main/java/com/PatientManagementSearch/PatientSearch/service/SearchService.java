package com.PatientManagementSearch.PatientSearch.service;

import com.PatientManagementSearch.PatientSearch.dto.HistoryRequestDto;
import com.PatientManagementSearch.PatientSearch.dto.HistoryResponseDto;
import com.PatientManagementSearch.PatientSearch.entity.History;

import java.util.List;

public interface SearchService {

    List<History> getPatientRecordFromHistory(String text);
    History save(History history);

//    List<HistoryResponseDto> getByMonth(String month);
//
//    List<HistoryResponseDto> getByIssue(String issue);

    List<History> findAll();
}
