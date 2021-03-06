package com.piotrmajcher.piwind.services.utils;

import com.piotrmajcher.piwind.sensordata.WindSpeed;
import com.piotrmajcher.piwind.services.utils.exceptions.WindSpeedReaderException;

public interface WindSpeedReader {
    WindSpeed fetchWindSpeed() throws WindSpeedReaderException;
}
