package com.ojas.ohams.service;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ojas.ohams.model.PMO;

@Service
public interface OhamsService {

	PMO savePmo(PMO pmo);

	List<PMO> getAllPmo();

	String deleteAllPmo();

	PMO updatePmo(String pmoId, PMO pmo);

	void bulkUpload(MultipartFile excelFile) throws IOException;

}
