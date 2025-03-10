package com.zq.influxdb.example;

import com.influxdb.annotations.Column;
import com.influxdb.annotations.Measurement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Measurement(name = "temperature")
public class Temperature {


        @Column(tag = true)
        String location;

        @Column
        Integer value;

        @Column(timestamp = true)
        Instant time;
}
