package com.dukz.DI.impl;

import com.dukz.DI.Knight;

public class DamselRescuingKnight implements Knight {

	private RescueDamselQuest quest;

	public DamselRescuingKnight(){
		this.quest = new RescueDamselQuest();
	}

	@Override
	public void embarkOnQuest() {
		quest.embark();
	}
}