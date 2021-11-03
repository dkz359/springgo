package com.dukz.config;

import com.dukz.DI.Knight;
import com.dukz.DI.Quest;
import com.dukz.DI.impl.DamselRescuingKnight;
import com.dukz.DI.impl.RescueDamselQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

	@Bean
	public Knight knight(){
		return new DamselRescuingKnight();
	}

	@Bean
	public Quest quest(){
		return new RescueDamselQuest();
	}

}
