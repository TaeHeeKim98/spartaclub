package com.sparta.springresttemplateclient.naver.controller;

import com.sparta.springresttemplateclient.naver.dto.ItemDto;
import com.sparta.springresttemplateclient.naver.service.NaverApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class NaverApiController {

    private final NaverApiService naverApiService;

    public NaverApiController(NaverApiService naverApiService) {
        this.naverApiService = naverApiService;
    }

    @GetMapping("/search")
    public List<ItemDto> searchItems(@RequestParam String query)  {

        List<ItemDto> searchItems = naverApiService.searchItems(query);

        return searchItems;
    }
}