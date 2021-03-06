package com.web.netflix.repository;

import com.web.netflix.entity.NetflixTitle;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ShowRepositoryJpa  extends PagingAndSortingRepository<NetflixTitle, String> {

}
