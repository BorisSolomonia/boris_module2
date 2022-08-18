package com.epam.esm.service;

import com.epam.esm.dto.GiftCertificateDto;
import com.epam.esm.dto.TagDto;

import java.util.List;

public interface GiftCertificateService {
    public GiftCertificateDto getGiftCertificateById(long id);
    List<GiftCertificateDto> getAllGiftCertificates();
    GiftCertificateDto createGiftCertificate(GiftCertificateDto dto);
    void deleteGiftCertificateById(Long id);
    TagDto getTagOfGiftCertificate(long id);
}
