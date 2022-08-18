package com.epam.esm.service;

import com.epam.esm.dto.GiftCertificateDto;
import com.epam.esm.dto.TagDto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GiftCertificateServiceImpl implements GiftCertificateService{

    protected static List<GiftCertificateDto> giftCertificates =  new ArrayList<>();

    @Override
    public GiftCertificateDto getGiftCertificateById(long id) {
        return giftCertificates.stream().filter(x -> x.getId() == id).findAny().get();
    }

    @Override
    public List<GiftCertificateDto> getAllGiftCertificates() {
        return giftCertificates;
    }

    @Override
    public GiftCertificateDto createGiftCertificate(GiftCertificateDto dto) {
        giftCertificates.add(dto);
        return dto;
    }

    @Override
    public void deleteGiftCertificateById(Long id) {
        giftCertificates = giftCertificates.stream().filter(x -> x.getId() != id)
                .collect(Collectors.toList());
    }

    @Override
    public TagDto getTagOfGiftCertificate(long id) {
        GiftCertificateDto giftCertificateDtoId
                = getGiftCertificateById(id);
        return TagServiceImpl.tags.stream().filter(x -> x.getId()
                == giftCertificateDtoId.getTagId()).findAny().get();
    }
}
