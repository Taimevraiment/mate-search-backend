package com.taim.matesearch.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.taim.matesearch.service.UserTeamService;
import com.taim.matesearch.model.domain.UserTeam;
import com.taim.matesearch.mapper.UserTeamMapper;
import org.springframework.stereotype.Service;

/**
 * 用户队伍服务实现类
 *
 * @author taim
 */
@Service
public class UserTeamServiceImpl extends ServiceImpl<UserTeamMapper, UserTeam>
        implements UserTeamService {

}




