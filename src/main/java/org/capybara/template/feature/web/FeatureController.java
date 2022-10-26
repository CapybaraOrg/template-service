package org.capybara.template.feature.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/feature")
public class FeatureController {

    @PostMapping("/")
    public ResponseEntity<FeatureResponse> add(@Valid @RequestBody FeatureRequest featureRequest) {
        FeatureResponse featureResponse = new FeatureResponse();
        featureResponse.setData(featureRequest.getData());
        return ResponseEntity.ok(featureResponse);
    }

}
