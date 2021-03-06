package com.pwrd.war.robot.msg;

import java.util.HashMap;
import java.util.Map;

import com.pwrd.war.core.msg.MessageType;
import com.pwrd.war.common.MessageMappingProvider;

import com.pwrd.war.gameserver.activity.msg.CGActivityList;
import com.pwrd.war.gameserver.activity.msg.GCActivityList;
import com.pwrd.war.gameserver.activity.msg.GCActivityStart;
import com.pwrd.war.gameserver.activity.msg.GCActivityStop;
import com.pwrd.war.gameserver.activity.msg.CGActivityJoin;
import com.pwrd.war.gameserver.activity.msg.CGActivityUnjoin;
import com.pwrd.war.gameserver.activity.msg.GCActivityBossInfo;
import com.pwrd.war.gameserver.activity.msg.GCActivityBossRanks;
import com.pwrd.war.gameserver.activity.msg.CGActivityBossAttack;
import com.pwrd.war.gameserver.activity.msg.GCActivityBossCanMove;
import com.pwrd.war.gameserver.activity.msg.CGActivityBossRelive;
import com.pwrd.war.gameserver.activity.msg.GCActivityBossPlayerInfo;
import com.pwrd.war.gameserver.activity.msg.CGActivityBossGuwuSee;
import com.pwrd.war.gameserver.activity.msg.GCActivityBossGuwuSee;
import com.pwrd.war.gameserver.activity.msg.CGActivityBossGuwuGold;
import com.pwrd.war.gameserver.activity.msg.GCActivityBossGuwuGold;
import com.pwrd.war.gameserver.activity.msg.GCActivityBossKaoshang;
import com.pwrd.war.gameserver.activity.msg.CGActivityBossKaoshang;
import com.pwrd.war.gameserver.activity.msg.GCActivityBossKaoshangShanghai;
import com.pwrd.war.gameserver.activity.msg.CGActivityBossBuyTower;
import com.pwrd.war.gameserver.activity.msg.GCActivityBossTowerList;
import com.pwrd.war.gameserver.activity.msg.GCActivityBossTowerAdd;
import com.pwrd.war.gameserver.activity.msg.GCActivityBossTowerAttack;
import com.pwrd.war.gameserver.activity.msg.GCActivityBossRankTop3;
import com.pwrd.war.gameserver.activity.msg.GCActivityHeroWarList;
import com.pwrd.war.gameserver.activity.msg.CGActivityHeroWarAttack;
import com.pwrd.war.gameserver.activity.msg.GCActivityCampWarIndex;
import com.pwrd.war.gameserver.activity.msg.GCActivityCampWarRobCdtime;
import com.pwrd.war.gameserver.activity.msg.GCActivityCampWarBuff;
import com.pwrd.war.gameserver.activity.msg.GCActivityCampWarSkills;
import com.pwrd.war.gameserver.activity.msg.GCActivityCampWarScore;
import com.pwrd.war.gameserver.activity.msg.GCActivityCampWarLog;
import com.pwrd.war.gameserver.activity.msg.GCActivityCampWarRobCombWin;
import com.pwrd.war.gameserver.activity.msg.GCActivityCampWarRobAddLog;
import com.pwrd.war.gameserver.activity.msg.GCActivityCampWarRobInfo;
import com.pwrd.war.gameserver.activity.msg.GCActivityCampWarStartTransport;
import com.pwrd.war.gameserver.activity.msg.GCActivityCampWarTransportAdd;
import com.pwrd.war.gameserver.activity.msg.GCActivityCampWarTransportDel;
import com.pwrd.war.gameserver.activity.msg.GCActivityCampWarProtectList;
import com.pwrd.war.gameserver.activity.msg.GCActivityCampWarRobList;
import com.pwrd.war.gameserver.activity.msg.GCActivityCampWarTransportDetail;
import com.pwrd.war.gameserver.activity.msg.GCActivityCampWarHeroBuffAdd;
import com.pwrd.war.gameserver.activity.msg.CGActivityCampWarTransportDetail;
import com.pwrd.war.gameserver.activity.msg.CGActivityCampWarUseSkill;
import com.pwrd.war.gameserver.activity.msg.CGActivityCampWarRobCamp;
import com.pwrd.war.gameserver.activity.msg.CGActivityCampWarRobBack;
import com.pwrd.war.gameserver.activity.msg.CGActivityCampWarStartRob;
import com.pwrd.war.gameserver.activity.msg.GCActivityGgzjInfo;
import com.pwrd.war.gameserver.activity.msg.GCActivityGgzjProgress;
import com.pwrd.war.gameserver.activity.msg.GCActivityGgzjRanks;
import com.pwrd.war.gameserver.activity.msg.GCActivityGgzjCanMove;
import com.pwrd.war.gameserver.activity.msg.CGActivityGgzjRelive;
import com.pwrd.war.gameserver.activity.msg.GCActivityGgzjPlayerInfo;
import com.pwrd.war.gameserver.activity.msg.CGActivityGgzjGuwuSee;
import com.pwrd.war.gameserver.activity.msg.GCActivityGgzjGuwuSee;
import com.pwrd.war.gameserver.activity.msg.CGActivityGgzjGuwuGold;
import com.pwrd.war.gameserver.activity.msg.GCActivityGgzjGuwuGold;
import com.pwrd.war.gameserver.activity.msg.CGActivityGgzjPfcz;
import com.pwrd.war.gameserver.activity.msg.GCActivityGgzjPfcz;
import com.pwrd.war.gameserver.activity.msg.CGActivityGgzjGetTower;
import com.pwrd.war.gameserver.activity.msg.GCActivityGgzjGetTower;
import com.pwrd.war.gameserver.activity.msg.GCActivityGgzjRankTop3;
import com.pwrd.war.gameserver.activity.msg.GCActivityWorldWarInfo;
import com.pwrd.war.gameserver.activity.msg.GCActivityWorldWarPlayres;
import com.pwrd.war.gameserver.activity.msg.GCActivityWorldWarPlayresAdd;
import com.pwrd.war.gameserver.activity.msg.GCActivityWorldWarPlayresDel;
import com.pwrd.war.gameserver.activity.msg.GCActivityWorldWarPlayerInfo;
import com.pwrd.war.gameserver.activity.msg.GCActivityWorldWarRanksInfo;
import com.pwrd.war.gameserver.activity.msg.GCActivityWorldWarBattleAdd;
import com.pwrd.war.gameserver.activity.msg.CGActivityWorldWarGuwu;
import com.pwrd.war.gameserver.activity.msg.CGActivityWorldWarAutoWar;
import com.pwrd.war.gameserver.activity.msg.CGActivityWorldWarStart;
import com.pwrd.war.gameserver.activity.msg.CGActivityWorldWarCancel;

/**
 *  Generated by MessageCodeGenerator,don't modify please.
 *  Need to register in<code>GameMessageRecognizer#init</code>
 */
public class ActivityMsgMappingProvider implements MessageMappingProvider {

	@Override
	public Map<Short, Class<?>> getMessageMapping() {
		Map<Short, Class<?>> map = new HashMap<Short, Class<?>>();
		map.put(MessageType.CG_ACTIVITY_LIST, CGActivityList.class);
		map.put(MessageType.GC_ACTIVITY_LIST, GCActivityList.class);
		map.put(MessageType.GC_ACTIVITY_START, GCActivityStart.class);
		map.put(MessageType.GC_ACTIVITY_STOP, GCActivityStop.class);
		map.put(MessageType.CG_ACTIVITY_JOIN, CGActivityJoin.class);
		map.put(MessageType.CG_ACTIVITY_UNJOIN, CGActivityUnjoin.class);
		map.put(MessageType.GC_ACTIVITY_BOSS_INFO, GCActivityBossInfo.class);
		map.put(MessageType.GC_ACTIVITY_BOSS_RANKS, GCActivityBossRanks.class);
		map.put(MessageType.CG_ACTIVITY_BOSS_ATTACK, CGActivityBossAttack.class);
		map.put(MessageType.GC_ACTIVITY_BOSS_CAN_MOVE, GCActivityBossCanMove.class);
		map.put(MessageType.CG_ACTIVITY_BOSS_RELIVE, CGActivityBossRelive.class);
		map.put(MessageType.GC_ACTIVITY_BOSS_PLAYER_INFO, GCActivityBossPlayerInfo.class);
		map.put(MessageType.CG_ACTIVITY_BOSS_GUWU_SEE, CGActivityBossGuwuSee.class);
		map.put(MessageType.GC_ACTIVITY_BOSS_GUWU_SEE, GCActivityBossGuwuSee.class);
		map.put(MessageType.CG_ACTIVITY_BOSS_GUWU_GOLD, CGActivityBossGuwuGold.class);
		map.put(MessageType.GC_ACTIVITY_BOSS_GUWU_GOLD, GCActivityBossGuwuGold.class);
		map.put(MessageType.GC_ACTIVITY_BOSS_KAOSHANG, GCActivityBossKaoshang.class);
		map.put(MessageType.CG_ACTIVITY_BOSS_KAOSHANG, CGActivityBossKaoshang.class);
		map.put(MessageType.GC_ACTIVITY_BOSS_KAOSHANG_SHANGHAI, GCActivityBossKaoshangShanghai.class);
		map.put(MessageType.CG_ACTIVITY_BOSS_BUY_TOWER, CGActivityBossBuyTower.class);
		map.put(MessageType.GC_ACTIVITY_BOSS_TOWER_LIST, GCActivityBossTowerList.class);
		map.put(MessageType.GC_ACTIVITY_BOSS_TOWER_ADD, GCActivityBossTowerAdd.class);
		map.put(MessageType.GC_ACTIVITY_BOSS_TOWER_ATTACK, GCActivityBossTowerAttack.class);
		map.put(MessageType.GC_ACTIVITY_BOSS_RANK_TOP3, GCActivityBossRankTop3.class);
		map.put(MessageType.GC_ACTIVITY_HERO_WAR_LIST, GCActivityHeroWarList.class);
		map.put(MessageType.CG_ACTIVITY_HERO_WAR_ATTACK, CGActivityHeroWarAttack.class);
		map.put(MessageType.GC_ACTIVITY_CAMP_WAR_INDEX, GCActivityCampWarIndex.class);
		map.put(MessageType.GC_ACTIVITY_CAMP_WAR_ROB_CDTIME, GCActivityCampWarRobCdtime.class);
		map.put(MessageType.GC_ACTIVITY_CAMP_WAR_BUFF, GCActivityCampWarBuff.class);
		map.put(MessageType.GC_ACTIVITY_CAMP_WAR_SKILLS, GCActivityCampWarSkills.class);
		map.put(MessageType.GC_ACTIVITY_CAMP_WAR_SCORE, GCActivityCampWarScore.class);
		map.put(MessageType.GC_ACTIVITY_CAMP_WAR_LOG, GCActivityCampWarLog.class);
		map.put(MessageType.GC_ACTIVITY_CAMP_WAR_ROB_COMB_WIN, GCActivityCampWarRobCombWin.class);
		map.put(MessageType.GC_ACTIVITY_CAMP_WAR_ROB_ADD_LOG, GCActivityCampWarRobAddLog.class);
		map.put(MessageType.GC_ACTIVITY_CAMP_WAR_ROB_INFO, GCActivityCampWarRobInfo.class);
		map.put(MessageType.GC_ACTIVITY_CAMP_WAR_START_TRANSPORT, GCActivityCampWarStartTransport.class);
		map.put(MessageType.GC_ACTIVITY_CAMP_WAR_TRANSPORT_ADD, GCActivityCampWarTransportAdd.class);
		map.put(MessageType.GC_ACTIVITY_CAMP_WAR_TRANSPORT_DEL, GCActivityCampWarTransportDel.class);
		map.put(MessageType.GC_ACTIVITY_CAMP_WAR_PROTECT_LIST, GCActivityCampWarProtectList.class);
		map.put(MessageType.GC_ACTIVITY_CAMP_WAR_ROB_LIST, GCActivityCampWarRobList.class);
		map.put(MessageType.GC_ACTIVITY_CAMP_WAR_TRANSPORT_DETAIL, GCActivityCampWarTransportDetail.class);
		map.put(MessageType.GC_ACTIVITY_CAMP_WAR_HERO_BUFF_ADD, GCActivityCampWarHeroBuffAdd.class);
		map.put(MessageType.CG_ACTIVITY_CAMP_WAR_TRANSPORT_DETAIL, CGActivityCampWarTransportDetail.class);
		map.put(MessageType.CG_ACTIVITY_CAMP_WAR_USE_SKILL, CGActivityCampWarUseSkill.class);
		map.put(MessageType.CG_ACTIVITY_CAMP_WAR_ROB_CAMP, CGActivityCampWarRobCamp.class);
		map.put(MessageType.CG_ACTIVITY_CAMP_WAR_ROB_BACK, CGActivityCampWarRobBack.class);
		map.put(MessageType.CG_ACTIVITY_CAMP_WAR_START_ROB, CGActivityCampWarStartRob.class);
		map.put(MessageType.GC_ACTIVITY_GGZJ_INFO, GCActivityGgzjInfo.class);
		map.put(MessageType.GC_ACTIVITY_GGZJ_PROGRESS, GCActivityGgzjProgress.class);
		map.put(MessageType.GC_ACTIVITY_GGZJ_RANKS, GCActivityGgzjRanks.class);
		map.put(MessageType.GC_ACTIVITY_GGZJ_CAN_MOVE, GCActivityGgzjCanMove.class);
		map.put(MessageType.CG_ACTIVITY_GGZJ_RELIVE, CGActivityGgzjRelive.class);
		map.put(MessageType.GC_ACTIVITY_GGZJ_PLAYER_INFO, GCActivityGgzjPlayerInfo.class);
		map.put(MessageType.CG_ACTIVITY_GGZJ_GUWU_SEE, CGActivityGgzjGuwuSee.class);
		map.put(MessageType.GC_ACTIVITY_GGZJ_GUWU_SEE, GCActivityGgzjGuwuSee.class);
		map.put(MessageType.CG_ACTIVITY_GGZJ_GUWU_GOLD, CGActivityGgzjGuwuGold.class);
		map.put(MessageType.GC_ACTIVITY_GGZJ_GUWU_GOLD, GCActivityGgzjGuwuGold.class);
		map.put(MessageType.CG_ACTIVITY_GGZJ_PFCZ, CGActivityGgzjPfcz.class);
		map.put(MessageType.GC_ACTIVITY_GGZJ_PFCZ, GCActivityGgzjPfcz.class);
		map.put(MessageType.CG_ACTIVITY_GGZJ_GET_TOWER, CGActivityGgzjGetTower.class);
		map.put(MessageType.GC_ACTIVITY_GGZJ_GET_TOWER, GCActivityGgzjGetTower.class);
		map.put(MessageType.GC_ACTIVITY_GGZJ_RANK_TOP3, GCActivityGgzjRankTop3.class);
		map.put(MessageType.GC_ACTIVITY_WORLD_WAR_INFO, GCActivityWorldWarInfo.class);
		map.put(MessageType.GC_ACTIVITY_WORLD_WAR_PLAYRES, GCActivityWorldWarPlayres.class);
		map.put(MessageType.GC_ACTIVITY_WORLD_WAR_PLAYRES_ADD, GCActivityWorldWarPlayresAdd.class);
		map.put(MessageType.GC_ACTIVITY_WORLD_WAR_PLAYRES_DEL, GCActivityWorldWarPlayresDel.class);
		map.put(MessageType.GC_ACTIVITY_WORLD_WAR_PLAYER_INFO, GCActivityWorldWarPlayerInfo.class);
		map.put(MessageType.GC_ACTIVITY_WORLD_WAR_RANKS_INFO, GCActivityWorldWarRanksInfo.class);
		map.put(MessageType.GC_ACTIVITY_WORLD_WAR_BATTLE_ADD, GCActivityWorldWarBattleAdd.class);
		map.put(MessageType.CG_ACTIVITY_WORLD_WAR_GUWU, CGActivityWorldWarGuwu.class);
		map.put(MessageType.CG_ACTIVITY_WORLD_WAR_AUTO_WAR, CGActivityWorldWarAutoWar.class);
		map.put(MessageType.CG_ACTIVITY_WORLD_WAR_START, CGActivityWorldWarStart.class);
		map.put(MessageType.CG_ACTIVITY_WORLD_WAR_CANCEL, CGActivityWorldWarCancel.class);
		return map;
	}

}
