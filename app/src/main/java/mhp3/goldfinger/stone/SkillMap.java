package mhp3.goldfinger.stone;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 */
public final class SkillMap {

    private static final SkillMeta SKILL_0 = new SkillMeta(0, "无技能");
    private static final SkillMeta SKILL_1 = new SkillMeta(1, "胴系统倍加");
    private static final SkillMeta SKILL_2 = new SkillMeta(2, "毒");
    private static final SkillMeta SKILL_3 = new SkillMeta(3, "麻痹");
    private static final SkillMeta SKILL_4 = new SkillMeta(4, "睡眠");
    private static final SkillMeta SKILL_5 = new SkillMeta(5, "气绝");
    private static final SkillMeta SKILL_6 = new SkillMeta(6, "耐泥耐雪");
    private static final SkillMeta SKILL_7 = new SkillMeta(7, "气配");
    private static final SkillMeta SKILL_8 = new SkillMeta(8, "体力");
    private static final SkillMeta SKILL_9 = new SkillMeta(9, "回复速度");
    private static final SkillMeta SKILL_10 = new SkillMeta(10, "锋利度");
    private static final SkillMeta SKILL_11 = new SkillMeta(11, "匠");
    private static final SkillMeta SKILL_12 = new SkillMeta(12, "剑术");
    private static final SkillMeta SKILL_13 = new SkillMeta(13, "达人");
    private static final SkillMeta SKILL_14 = new SkillMeta(14, "研磨师");
    private static final SkillMeta SKILL_15 = new SkillMeta(15, "防御性能");
    private static final SkillMeta SKILL_16 = new SkillMeta(16, "防御强化");
    private static final SkillMeta SKILL_17 = new SkillMeta(17, "自动防御");
    private static final SkillMeta SKILL_18 = new SkillMeta(18, "装填速度");
    private static final SkillMeta SKILL_19 = new SkillMeta(19, "反动");
    private static final SkillMeta SKILL_20 = new SkillMeta(20, "通常弹强化");
    private static final SkillMeta SKILL_21 = new SkillMeta(21, "贯通弹强化");
    private static final SkillMeta SKILL_22 = new SkillMeta(22, "散弹强化");
    private static final SkillMeta SKILL_23 = new SkillMeta(23, "通常弹追加");
    private static final SkillMeta SKILL_24 = new SkillMeta(24, "贯通弹追加");
    private static final SkillMeta SKILL_25 = new SkillMeta(25, "散弹追加");
    private static final SkillMeta SKILL_26 = new SkillMeta(26, "榴弹追加");
    private static final SkillMeta SKILL_27 = new SkillMeta(27, "扩散弹追加");
    private static final SkillMeta SKILL_28 = new SkillMeta(28, "特殊攻击");
    private static final SkillMeta SKILL_29 = new SkillMeta(29, "属性攻击");
    private static final SkillMeta SKILL_30 = new SkillMeta(30, "爆弹强化");
    private static final SkillMeta SKILL_31 = new SkillMeta(31, "饥饿");
    private static final SkillMeta SKILL_32 = new SkillMeta(32, "贪食鬼");
    private static final SkillMeta SKILL_33 = new SkillMeta(33, "攻击");
    private static final SkillMeta SKILL_34 = new SkillMeta(34, "防御");
    private static final SkillMeta SKILL_35 = new SkillMeta(35, "加护");
    private static final SkillMeta SKILL_36 = new SkillMeta(36, "听觉保护");
    private static final SkillMeta SKILL_37 = new SkillMeta(37, "偷盗无效");
    private static final SkillMeta SKILL_38 = new SkillMeta(38, "广域");
    private static final SkillMeta SKILL_39 = new SkillMeta(39, "搬运");
    private static final SkillMeta SKILL_40 = new SkillMeta(40, "火耐性");
    private static final SkillMeta SKILL_41 = new SkillMeta(41, "水耐性");
    private static final SkillMeta SKILL_42 = new SkillMeta(42, "雷耐性");
    private static final SkillMeta SKILL_43 = new SkillMeta(43, "冰耐性");
    private static final SkillMeta SKILL_44 = new SkillMeta(44, "龙耐性");
    private static final SkillMeta SKILL_45 = new SkillMeta(45, "耐暑");
    private static final SkillMeta SKILL_46 = new SkillMeta(46, "耐寒");
    private static final SkillMeta SKILL_47 = new SkillMeta(47, "风压");
    private static final SkillMeta SKILL_48 = new SkillMeta(48, "采取");
    private static final SkillMeta SKILL_49 = new SkillMeta(49, "高速收集");
    private static final SkillMeta SKILL_50 = new SkillMeta(50, "反复无常");
    private static final SkillMeta SKILL_51 = new SkillMeta(51, "运气");
    private static final SkillMeta SKILL_52 = new SkillMeta(52, "千里眼");
    private static final SkillMeta SKILL_53 = new SkillMeta(53, "回复量");
    private static final SkillMeta SKILL_54 = new SkillMeta(54, "调和成功率");
    private static final SkillMeta SKILL_55 = new SkillMeta(55, "调和数");
    private static final SkillMeta SKILL_56 = new SkillMeta(56, "回避性能");
    private static final SkillMeta SKILL_57 = new SkillMeta(57, "底力");
    private static final SkillMeta SKILL_58 = new SkillMeta(58, "效果持续");
    private static final SkillMeta SKILL_59 = new SkillMeta(59, "耐力");
    private static final SkillMeta SKILL_60 = new SkillMeta(60, "装填数");
    private static final SkillMeta SKILL_61 = new SkillMeta(61, "精密射击");
    private static final SkillMeta SKILL_62 = new SkillMeta(62, "食事");
    private static final SkillMeta SKILL_63 = new SkillMeta(63, "剥取");
    private static final SkillMeta SKILL_64 = new SkillMeta(64, "耐震");
    private static final SkillMeta SKILL_65 = new SkillMeta(65, "回避距离");
    private static final SkillMeta SKILL_66 = new SkillMeta(66, "拔刀会心");
    private static final SkillMeta SKILL_67 = new SkillMeta(67, "高速设置");
    private static final SkillMeta SKILL_68 = new SkillMeta(68, "体术");
    private static final SkillMeta SKILL_69 = new SkillMeta(69, "捕获");
    private static final SkillMeta SKILL_70 = new SkillMeta(70, "观察眼");
    private static final SkillMeta SKILL_71 = new SkillMeta(71, "蓄力缩短");
    private static final SkillMeta SKILL_72 = new SkillMeta(72, "拔刀减气");
    private static final SkillMeta SKILL_73 = new SkillMeta(73, "属性耐性");
    private static final SkillMeta SKILL_74 = new SkillMeta(74, "逆境");
    private static final SkillMeta SKILL_75 = new SkillMeta(75, "速射");
    private static final SkillMeta SKILL_76 = new SkillMeta(76, "大粪");
    private static final SkillMeta SKILL_77 = new SkillMeta(77, "抗菌");
    private static final SkillMeta SKILL_78 = new SkillMeta(78, "毒瓶追加");
    private static final SkillMeta SKILL_79 = new SkillMeta(79, "麻痹瓶追加");
    private static final SkillMeta SKILL_80 = new SkillMeta(80, "睡眠瓶追加");
    private static final SkillMeta SKILL_81 = new SkillMeta(81, "强击瓶追加");
    private static final SkillMeta SKILL_82 = new SkillMeta(82, "接击瓶追加");
    private static final SkillMeta SKILL_83 = new SkillMeta(83, "笛");
    private static final SkillMeta SKILL_84 = new SkillMeta(84, "炮术");
    private static final SkillMeta SKILL_85 = new SkillMeta(85, "本气（认真）");
    private static final SkillMeta SKILL_86 = new SkillMeta(86, "狩人");
    private static final SkillMeta SKILL_87 = new SkillMeta(87, "对防御DOWN");
    private static final SkillMeta SKILL_88 = new SkillMeta(88, "火属性攻击");
    private static final SkillMeta SKILL_89 = new SkillMeta(89, "水属性攻击");
    private static final SkillMeta SKILL_90 = new SkillMeta(90, "雷属性攻击");
    private static final SkillMeta SKILL_91 = new SkillMeta(91, "冰属性攻击");
    private static final SkillMeta SKILL_92 = new SkillMeta(92, "龙属性攻击");
    private static final SkillMeta SKILL_93 = new SkillMeta(93, "斩裂弹追加");
    private static final SkillMeta SKILL_94 = new SkillMeta(94, "减气瓶追加");
    private static final SkillMeta SKILL_95 = new SkillMeta(95, "痛击");
    private static final SkillMeta SKILL_96 = new SkillMeta(96, "重击");
    private static final SkillMeta SKILL_97 = new SkillMeta(97, "KO");
    private static final SkillMeta SKILL_98 = new SkillMeta(98, "减气攻击");
    private static final SkillMeta SKILL_99 = new SkillMeta(99, "纳刀");
    private static final SkillMeta SKILL_100 = new SkillMeta(100, "气力回复");

    private static Map<Integer, SkillMeta> tempMap = new HashMap<>();
    static final Map<Integer, SkillMeta> skillMap;

    static {
        tempMap.put(SkillMap.SKILL_0.getId(), SkillMap.SKILL_0);
        tempMap.put(SkillMap.SKILL_1.getId(), SkillMap.SKILL_1);
        tempMap.put(SkillMap.SKILL_2.getId(), SkillMap.SKILL_2);
        tempMap.put(SkillMap.SKILL_3.getId(), SkillMap.SKILL_3);
        tempMap.put(SkillMap.SKILL_4.getId(), SkillMap.SKILL_4);
        tempMap.put(SkillMap.SKILL_5.getId(), SkillMap.SKILL_5);
        tempMap.put(SkillMap.SKILL_6.getId(), SkillMap.SKILL_6);
        tempMap.put(SkillMap.SKILL_7.getId(), SkillMap.SKILL_7);
        tempMap.put(SkillMap.SKILL_8.getId(), SkillMap.SKILL_8);
        tempMap.put(SkillMap.SKILL_9.getId(), SkillMap.SKILL_9);
        tempMap.put(SkillMap.SKILL_10.getId(), SkillMap.SKILL_10);
        tempMap.put(SkillMap.SKILL_11.getId(), SkillMap.SKILL_11);
        tempMap.put(SkillMap.SKILL_12.getId(), SkillMap.SKILL_12);
        tempMap.put(SkillMap.SKILL_13.getId(), SkillMap.SKILL_13);
        tempMap.put(SkillMap.SKILL_14.getId(), SkillMap.SKILL_14);
        tempMap.put(SkillMap.SKILL_15.getId(), SkillMap.SKILL_15);
        tempMap.put(SkillMap.SKILL_16.getId(), SkillMap.SKILL_16);
        tempMap.put(SkillMap.SKILL_17.getId(), SkillMap.SKILL_17);
        tempMap.put(SkillMap.SKILL_18.getId(), SkillMap.SKILL_18);
        tempMap.put(SkillMap.SKILL_19.getId(), SkillMap.SKILL_19);
        tempMap.put(SkillMap.SKILL_20.getId(), SkillMap.SKILL_20);
        tempMap.put(SkillMap.SKILL_21.getId(), SkillMap.SKILL_21);
        tempMap.put(SkillMap.SKILL_22.getId(), SkillMap.SKILL_22);
        tempMap.put(SkillMap.SKILL_23.getId(), SkillMap.SKILL_23);
        tempMap.put(SkillMap.SKILL_24.getId(), SkillMap.SKILL_24);
        tempMap.put(SkillMap.SKILL_25.getId(), SkillMap.SKILL_25);
        tempMap.put(SkillMap.SKILL_26.getId(), SkillMap.SKILL_26);
        tempMap.put(SkillMap.SKILL_27.getId(), SkillMap.SKILL_27);
        tempMap.put(SkillMap.SKILL_28.getId(), SkillMap.SKILL_28);
        tempMap.put(SkillMap.SKILL_29.getId(), SkillMap.SKILL_29);
        tempMap.put(SkillMap.SKILL_30.getId(), SkillMap.SKILL_30);
        tempMap.put(SkillMap.SKILL_31.getId(), SkillMap.SKILL_31);
        tempMap.put(SkillMap.SKILL_32.getId(), SkillMap.SKILL_32);
        tempMap.put(SkillMap.SKILL_33.getId(), SkillMap.SKILL_33);
        tempMap.put(SkillMap.SKILL_34.getId(), SkillMap.SKILL_34);
        tempMap.put(SkillMap.SKILL_35.getId(), SkillMap.SKILL_35);
        tempMap.put(SkillMap.SKILL_36.getId(), SkillMap.SKILL_36);
        tempMap.put(SkillMap.SKILL_37.getId(), SkillMap.SKILL_37);
        tempMap.put(SkillMap.SKILL_38.getId(), SkillMap.SKILL_38);
        tempMap.put(SkillMap.SKILL_39.getId(), SkillMap.SKILL_39);
        tempMap.put(SkillMap.SKILL_40.getId(), SkillMap.SKILL_40);
        tempMap.put(SkillMap.SKILL_41.getId(), SkillMap.SKILL_41);
        tempMap.put(SkillMap.SKILL_42.getId(), SkillMap.SKILL_42);
        tempMap.put(SkillMap.SKILL_43.getId(), SkillMap.SKILL_43);
        tempMap.put(SkillMap.SKILL_44.getId(), SkillMap.SKILL_44);
        tempMap.put(SkillMap.SKILL_45.getId(), SkillMap.SKILL_45);
        tempMap.put(SkillMap.SKILL_46.getId(), SkillMap.SKILL_46);
        tempMap.put(SkillMap.SKILL_47.getId(), SkillMap.SKILL_47);
        tempMap.put(SkillMap.SKILL_48.getId(), SkillMap.SKILL_48);
        tempMap.put(SkillMap.SKILL_49.getId(), SkillMap.SKILL_49);
        tempMap.put(SkillMap.SKILL_50.getId(), SkillMap.SKILL_50);
        tempMap.put(SkillMap.SKILL_51.getId(), SkillMap.SKILL_51);
        tempMap.put(SkillMap.SKILL_52.getId(), SkillMap.SKILL_52);
        tempMap.put(SkillMap.SKILL_53.getId(), SkillMap.SKILL_53);
        tempMap.put(SkillMap.SKILL_54.getId(), SkillMap.SKILL_54);
        tempMap.put(SkillMap.SKILL_55.getId(), SkillMap.SKILL_55);
        tempMap.put(SkillMap.SKILL_56.getId(), SkillMap.SKILL_56);
        tempMap.put(SkillMap.SKILL_57.getId(), SkillMap.SKILL_57);
        tempMap.put(SkillMap.SKILL_58.getId(), SkillMap.SKILL_58);
        tempMap.put(SkillMap.SKILL_59.getId(), SkillMap.SKILL_59);
        tempMap.put(SkillMap.SKILL_60.getId(), SkillMap.SKILL_60);
        tempMap.put(SkillMap.SKILL_61.getId(), SkillMap.SKILL_61);
        tempMap.put(SkillMap.SKILL_62.getId(), SkillMap.SKILL_62);
        tempMap.put(SkillMap.SKILL_63.getId(), SkillMap.SKILL_63);
        tempMap.put(SkillMap.SKILL_64.getId(), SkillMap.SKILL_64);
        tempMap.put(SkillMap.SKILL_65.getId(), SkillMap.SKILL_65);
        tempMap.put(SkillMap.SKILL_66.getId(), SkillMap.SKILL_66);
        tempMap.put(SkillMap.SKILL_67.getId(), SkillMap.SKILL_67);
        tempMap.put(SkillMap.SKILL_68.getId(), SkillMap.SKILL_68);
        tempMap.put(SkillMap.SKILL_69.getId(), SkillMap.SKILL_69);
        tempMap.put(SkillMap.SKILL_70.getId(), SkillMap.SKILL_70);
        tempMap.put(SkillMap.SKILL_71.getId(), SkillMap.SKILL_71);
        tempMap.put(SkillMap.SKILL_72.getId(), SkillMap.SKILL_72);
        tempMap.put(SkillMap.SKILL_73.getId(), SkillMap.SKILL_73);
        tempMap.put(SkillMap.SKILL_74.getId(), SkillMap.SKILL_74);
        tempMap.put(SkillMap.SKILL_75.getId(), SkillMap.SKILL_75);
        tempMap.put(SkillMap.SKILL_76.getId(), SkillMap.SKILL_76);
        tempMap.put(SkillMap.SKILL_77.getId(), SkillMap.SKILL_77);
        tempMap.put(SkillMap.SKILL_78.getId(), SkillMap.SKILL_78);
        tempMap.put(SkillMap.SKILL_79.getId(), SkillMap.SKILL_79);
        tempMap.put(SkillMap.SKILL_80.getId(), SkillMap.SKILL_80);
        tempMap.put(SkillMap.SKILL_81.getId(), SkillMap.SKILL_81);
        tempMap.put(SkillMap.SKILL_82.getId(), SkillMap.SKILL_82);
        tempMap.put(SkillMap.SKILL_83.getId(), SkillMap.SKILL_83);
        tempMap.put(SkillMap.SKILL_84.getId(), SkillMap.SKILL_84);
        tempMap.put(SkillMap.SKILL_85.getId(), SkillMap.SKILL_85);
        tempMap.put(SkillMap.SKILL_86.getId(), SkillMap.SKILL_86);
        tempMap.put(SkillMap.SKILL_87.getId(), SkillMap.SKILL_87);
        tempMap.put(SkillMap.SKILL_88.getId(), SkillMap.SKILL_88);
        tempMap.put(SkillMap.SKILL_89.getId(), SkillMap.SKILL_89);
        tempMap.put(SkillMap.SKILL_90.getId(), SkillMap.SKILL_90);
        tempMap.put(SkillMap.SKILL_91.getId(), SkillMap.SKILL_91);
        tempMap.put(SkillMap.SKILL_92.getId(), SkillMap.SKILL_92);
        tempMap.put(SkillMap.SKILL_93.getId(), SkillMap.SKILL_93);
        tempMap.put(SkillMap.SKILL_94.getId(), SkillMap.SKILL_94);
        tempMap.put(SkillMap.SKILL_95.getId(), SkillMap.SKILL_95);
        tempMap.put(SkillMap.SKILL_96.getId(), SkillMap.SKILL_96);
        tempMap.put(SkillMap.SKILL_97.getId(), SkillMap.SKILL_97);
        tempMap.put(SkillMap.SKILL_98.getId(), SkillMap.SKILL_98);
        tempMap.put(SkillMap.SKILL_99.getId(), SkillMap.SKILL_99);
        tempMap.put(SkillMap.SKILL_100.getId(), SkillMap.SKILL_100);

        skillMap = Collections.unmodifiableMap(tempMap);
        tempMap = null;
    }

    public static Skill getSkill(int id) {
        return getSkill(id, 0);
    }

    public static Skill getSkill(int id, int value) {
        SkillMeta skillMeta = skillMap.get(id);
        if (skillMeta != null) {
            Skill skill = new Skill(skillMeta.getId(), skillMeta.getName());
            skill.setValue(value);
            return skill;
        }
        
        return null;
    }

    public static class SkillMeta {
        private final int id;
        private final String name;

        public SkillMeta(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

}
