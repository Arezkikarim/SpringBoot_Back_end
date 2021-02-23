package fr.sorbonne.paris.nord.university.api.service;

import fr.sorbonne.paris.nord.university.api.entity.TeamEntity;
import fr.sorbonne.paris.nord.university.api.exception.TeamInvalidException;
import fr.sorbonne.paris.nord.university.api.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class TeamService  {
    final  private TeamRepository teamRepository ;

    @Autowired
    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }


    public List<TeamEntity> getTeams(){
        return teamRepository.findAll();
    }


    public Optional<TeamEntity> getTeamByID(long id){
       return teamRepository.findById(id);
    }


    @Transactional
    public Object addTeam(TeamEntity teamEntity){
        return teamRepository.save(teamEntity);
    }


    @Transactional
    public Object updateTeam(TeamEntity teamEntity){
        return  teamRepository.save(teamEntity);
    }


    @Transactional
    public void deleteTeam(long id){
        teamRepository.deleteById(id);
    }


    @Transactional
    public Object addTeamWithException(TeamEntity teamEntity)
            throws TeamInvalidException, IllegalAccessException {
        return teamRepository.save(teamEntity);
    }
}
