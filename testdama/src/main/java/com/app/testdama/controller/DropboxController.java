package com.app.testdama.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.testdama.service.DropboxApiService;

@RestController
public class DropboxController {

    private final DropboxApiService dropboxService;

    public DropboxController(DropboxApiService dropboxService) {
        this.dropboxService = dropboxService;
    }

    @GetMapping("/dropbox/team/info")
    public String getTeamInfo() throws Exception {
        return dropboxService.getTeamInfo();
    }

    @GetMapping("/dropbox/team/members")
    public String listMembers() throws Exception {
        return dropboxService.listTeamMembers();
    }

    @GetMapping("/dropbox/team/events")
    public String getEvents() throws Exception {
        return dropboxService.getTeamEvents();
    }
}
