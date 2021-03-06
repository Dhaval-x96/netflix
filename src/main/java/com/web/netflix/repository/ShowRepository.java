package com.web.netflix.repository;

import com.web.netflix.entity.NetflixTitle;

import java.util.List;

public interface ShowRepository {
    List<NetflixTitle> getAll()throws Exception;
}
