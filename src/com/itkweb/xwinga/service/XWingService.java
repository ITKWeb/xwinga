package com.itkweb.xwinga.service;

import java.util.List;
import java.util.Map;

import com.itkweb.xwinga.model.Box;

public interface XWingService {

	public List<Box> getBoxList();
	
	public void buildTeams(Map<Box, Integer> boxesSelection, int teamPoints);
}
