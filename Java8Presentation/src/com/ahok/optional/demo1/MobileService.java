package com.ahok.optional.demo1;
import java.util.Optional;

public class MobileService {

  public Integer getMobileScreenWidth(Optional<Mobile> mobile){
	return mobile.flatMap(Mobile::getDisplayFeatures)
		 .flatMap(DisplayFeatures::getResolution)
		 .map(ScreenResolution::getWidth)
		 .orElse(0);

  }
  
  
  public Integer getMobileScreenWidth1(Optional<Mobile> mobile){
		return mobile.flatMap(m->m.getDisplayFeatures())
			 .flatMap(DisplayFeatures::getResolution)
			 .map(ScreenResolution::getWidth)
			 .orElse(0);

	  }
  

}