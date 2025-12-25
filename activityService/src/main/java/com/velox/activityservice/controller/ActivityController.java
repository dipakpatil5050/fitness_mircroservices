package com.velox.activityservice.controller;

import com.velox.activityservice.dto.ActivityRequest;
import com.velox.activityservice.dto.ActivityResponse;
import com.velox.activityservice.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/activities")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @PostMapping
    public ResponseEntity<ActivityResponse> trackActivity(@RequestBody ActivityRequest request){
        return ResponseEntity.ok(activityService.trackActivity(request));
    }

//    @GetMapping
//    public ResponseEntity<List<ActivityResponse>> getUserActivities(@RequestHeader("X-User-ID") String userId){
//        return ResponseEntity.ok(activityService.getUserActivities(userId));
//    }
//
//
//    @GetMapping("/{activityId}")
//    public ResponseEntity<ActivityResponse> getActivity(@PathVariable String activityId){
//        return ResponseEntity.ok(activityService.getActivityById(activityId));
//    }
}
