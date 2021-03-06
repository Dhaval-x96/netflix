package com.web.netflix.Service.impl;

import com.web.netflix.config.Constants;
import com.web.netflix.repository.ShowRepository;
import com.web.netflix.Service.ShowService;
import com.web.netflix.json.NetflixTitlePageResponse;
import com.web.netflix.json.resource.NetflixTitlePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(Constants.SHOW_NETFLIX_TITLE_SESSION_FACTORY)
public class ShowServiceImpl implements ShowService {

    @Autowired
    private ShowRepository showRepository;

    @Override
    public NetflixTitlePageResponse getAll() throws Exception {

        NetflixTitlePage netflixTitlePage = new NetflixTitlePage();
        netflixTitlePage.setNetflixTitles(this.showRepository.getAll());
        NetflixTitlePageResponse netflixTitlePageResponse = new NetflixTitlePageResponse();
        netflixTitlePageResponse.setNetflixTitlePage(netflixTitlePage);
        return netflixTitlePageResponse;
    }
}
