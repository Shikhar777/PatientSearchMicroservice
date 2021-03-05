package com.PatientManagementSearch.PatientSearch.repository;

import com.PatientManagementSearch.PatientSearch.entity.Patient;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


public interface ESearchRepository extends ElasticsearchRepository<Patient, Integer> {
}
