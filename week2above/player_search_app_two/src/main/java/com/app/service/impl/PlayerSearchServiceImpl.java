package com.app.service.impl;

import java.util.List;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.impl.PlayerSearchDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.service.PlayerSearchService;


public class PlayerSearchServiceImpl implements PlayerSearchService {

	private PlayerSearchDAO playerSearchDAO = new PlayerSearchDAOImpl();
	
	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player = null;
		if (id > 0 && id < 1000  ) {
			//code here for DAO
			System.out.println("in if before DAO call");
			player = playerSearchDAO.getPlayerById(id);
		} else {
			System.out.println();
			throw new BusinessException("Entered Player ID "+id+" is INVALID....");
		}
		return player;
	}

	@Override
	public Player getPlayerByContact(long contact) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		List<Player> allPlayersList = null;
		allPlayersList = playerSearchDAO.getAllPlayers();
		return allPlayersList;
	}

	@Override
	public List<Player> getPlayersByAge(int age) throws BusinessException {
		List<Player> agePlayersList = null;
		if (age > 0 && age < 100  ) {
			//code here for DAO
			agePlayersList = playerSearchDAO.getPlayersByAge(age);
		} else {
			throw new BusinessException("Entered Player Age "+age+" is INVALID....");
		}
		return agePlayersList;
	}

	@Override
	public List<Player> getPlayersByGender(String gender) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByTeamName(String teamname) throws BusinessException {
		List<Player> teamPlayersList =  null;
		if (teamname != null && teamname.matches("[a-zA-A]{5,20}")) {
			teamPlayersList = playerSearchDAO.getPlayersByTeamName(teamname);
			
		}else {
			throw new BusinessException("Entered TeamName"+teamname+" is INVALID");
		}
		return teamPlayersList;
	}

	@Override
	public List<Player> getPlayersByName(String gendenamer) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByDob(String dob) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}