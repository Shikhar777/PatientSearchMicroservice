package com.PatientManagementSearch.PatientSearch.searchrepo;

import com.PatientManagementSearch.PatientSearch.dto.HistoryRequestDto;
import com.PatientManagementSearch.PatientSearch.dto.HistoryResponseDto;
import com.PatientManagementSearch.PatientSearch.entity.History;
import com.PatientManagementSearch.PatientSearch.entity.Patient;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


public interface SearchRepository extends ElasticsearchRepository<History, Integer> {
}
