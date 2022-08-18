package com.epam.esm.service;

import com.epam.esm.dto.GiftCertificateDto;
import com.epam.esm.dto.TagDto;

import java.util.List;

public interface TagService {
    public TagDto getTagById(long id);
    List<TagDto> getAllTags();
    TagDto createTag(TagDto dto);
    void deleteTagById(Long id);
    List<GiftCertificateDto> getGiftCertificateOfTag(long id);
}
