package com.epam.esm.controller;
import com.epam.esm.dto.TagDto;
import com.epam.esm.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

//jdbc:postgresql://localhost:5432/module2Sec_db

@RestController
@RequestMapping(value = "/api/v1", produces = "application/json")
public class TagController {
    @Autowired
    private TagService tagService;

    @GetMapping("tags/{id}")
    public TagDto getTagById(@PathVariable("id") long id){
        return tagService.getTagById(id);
    }

    @GetMapping("tags/")
    public List<TagDto> getAllTags(){
        return tagService.getAllTags();
    }

    @PostMapping("tags")
    @ResponseStatus(HttpStatus.CREATED)
    //@RequestBody is an annotation that is receiving the values of the fields from the json. json(postman) ->
    // -> @RequestBody TagDto -> tagService.createTag(dto);
    public TagDto addTag(@RequestBody TagDto dto) {
        return tagService.createTag(dto);
    }

    @DeleteMapping("tags/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTag(@PathVariable Long id) {
        tagService.deleteTagById(id);
    }

    //commite
}
