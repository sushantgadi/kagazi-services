package com.opensource.kagazi.service;

import com.opensource.kagazi.to.ResponseTO;

public interface CoreService {
	public ResponseTO kagazimst();

	public ResponseTO kagaziMstDtl(String code);
}
