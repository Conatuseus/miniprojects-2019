package com.woowacourse.edd.application.converter;

import com.woowacourse.edd.application.dto.VideoPreviewResponse;
import com.woowacourse.edd.domain.Video;
import org.springframework.stereotype.Component;

import java.time.format.DateTimeFormatter;

@Component
public class VideoConverter {

    public VideoPreviewResponse toPreviewResponse(Video video) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyyMMddHH");
        String date = video.getCreateDate().format(format);
        return new VideoPreviewResponse(video.getId(), video.getYoutubeId().getYoutubeId(), video.getTitle().getTitle(), date);
    }
}
