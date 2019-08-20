package com.woowacourse.edd.presentation.controller;

import com.woowacourse.edd.application.dto.VideoSaveRequestDto;
import com.woowacourse.edd.application.dto.VideoUpdateRequestDto;
import com.woowacourse.edd.application.response.VideoPreviewResponse;
import com.woowacourse.edd.application.response.VideoResponse;
import com.woowacourse.edd.application.response.VideoUpdateResponse;
import com.woowacourse.edd.application.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/v1/videos")
public class VideoController {

    private final VideoService videoService;

    @Autowired
    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<VideoResponse> findVideo(@PathVariable long id) {
        VideoResponse videoResponse = videoService.find(id);
        return ResponseEntity.ok(videoResponse);
    }

    @GetMapping
    public ResponseEntity<Page<VideoPreviewResponse>> findVideos(final Pageable pageable) {
        return ResponseEntity.ok(videoService.findByPageRequest(pageable));
    }

    @PostMapping
    public ResponseEntity<VideoResponse> saveVideo(@RequestBody VideoSaveRequestDto requestDto) {
        VideoResponse response = videoService.save(requestDto);
        return ResponseEntity.created(URI.create("/v1/videos/" + response.getId())).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateVideo(@PathVariable Long id, @RequestBody VideoUpdateRequestDto requestDto) {
        VideoUpdateResponse response = videoService.update(id, requestDto);
        return ResponseEntity.status(HttpStatus.OK)
            .header("location", "/v1/videos/" + id)
            .body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteVideo(@PathVariable Long id) {
        videoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
