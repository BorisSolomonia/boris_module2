package com.epam.esm.service;

import com.epam.esm.dto.GiftCertificateDto;
import com.epam.esm.dto.TagDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class TagServiceImpl implements TagService {

    protected static List<TagDto> tags = new ArrayList<>();

    @Override
    public TagDto getTagById(long id) {
        return tags.stream().filter(s -> Objects.equals(s.getId(), id)).findAny().get();
    }

    @Override
    public List<TagDto> getAllTags() {
        return tags;
    }

    @Override
    public TagDto createTag(TagDto dto) {
        tags.add(dto);
        return dto;
    }

    @Override
    public void deleteTagById(Long id) {
        tags = tags.stream().filter(s -> !Objects.equals(s.getId(), id)).collect(Collectors.toList());
    }

    @Override
    public List<GiftCertificateDto> getGiftCertificateOfTag(long id) {
        return GiftCertificateServiceImpl.giftCertificates.stream().filter(x -> x.getTagId() == id)
                .collect(Collectors.toList());
    }

}
