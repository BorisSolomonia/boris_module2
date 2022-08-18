package com.epam.esm.controller;

import com.epam.esm.dto.GiftCertificateDto;
import com.epam.esm.service.GiftCertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class GiftCertificateController {
    @Autowired
    private GiftCertificateService giftCertificateService;

    @GetMapping("giftcertificates/{id}")
    public GiftCertificateDto getGiftCertificateById(@PathVariable("id") long id){
        return giftCertificateService.getGiftCertificateById(id);
    }

    @GetMapping("giftcertificates/")
    public List<GiftCertificateDto> getAllGiftCertificates(){
        return giftCertificateService.getAllGiftCertificates();
    }

    @PostMapping("giftcertificates")
    @ResponseStatus(HttpStatus.CREATED)
    //@RequestBody is an annotation that is receiving the values of the fields from the json. json(postman) ->
    // -> @RequestBody TagDto -> tagService.createTag(dto);
    public GiftCertificateDto addGiftCertificate(@RequestBody GiftCertificateDto dto) {
        return giftCertificateService.createGiftCertificate(dto);
    }

    @DeleteMapping("giftcertificates/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteGiftCertificate(@PathVariable Long id) {
        giftCertificateService.deleteGiftCertificateById(id);
    }
}
