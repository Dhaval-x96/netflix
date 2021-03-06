package com.web.netflix.Service;

import com.web.netflix.json.NetflixTitlePageResponse;

public interface ShowService {
    NetflixTitlePageResponse getAll() throws Exception;
}
