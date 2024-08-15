package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateExternalIssuesRequest 创单请求参数
 */
public class CreateExternalIssuesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regions")

    private List<String> regions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project")

    private String enterpriseProject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private String sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fount_time")

    private Long fountTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "impacted_cloud_services")

    private List<String> impactedCloudServices = null;

    /**
     * 问题级别 issues_level_1000 致命 issues_level_2000 严重 issues_level_3000 一般
     */
    public static final class LevelEnum {

        /**
         * Enum ISSUES_LEVEL_1000 for value: "issues_level_1000"
         */
        public static final LevelEnum ISSUES_LEVEL_1000 = new LevelEnum("issues_level_1000");

        /**
         * Enum ISSUES_LEVEL_2000 for value: "issues_level_2000"
         */
        public static final LevelEnum ISSUES_LEVEL_2000 = new LevelEnum("issues_level_2000");

        /**
         * Enum ISSUES_LEVEL_3000 for value: "issues_level_3000"
         */
        public static final LevelEnum ISSUES_LEVEL_3000 = new LevelEnum("issues_level_3000");

        private static final Map<String, LevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LevelEnum> createStaticFields() {
            Map<String, LevelEnum> map = new HashMap<>();
            map.put("issues_level_1000", ISSUES_LEVEL_1000);
            map.put("issues_level_2000", ISSUES_LEVEL_2000);
            map.put("issues_level_3000", ISSUES_LEVEL_3000);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LevelEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LevelEnum(value));
        }

        public static LevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LevelEnum) {
                return this.value.equals(((LevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private LevelEnum level;

    /**
     * 问题类型 issues_type_1000  功能性问题 issues_type_2000  性能问题 issues_type_3000  可靠性问题 issues_type_4000  兼容性问题 issues_type_5000  用户体验问题 issues_type_6000  可维护性问题 issues_type_7000  变更类问题 issues_type_8000  安全问题 issues_type_9000  工程实施类 issues_type_10000 交付部署问题 issues_type_11000 LLD规划问题 issues_type_12000 供用商问题 issues_type_13000 咨询类问题 issues_type_14000 需求类问题 issues_type_15000 其他问题
     */
    public static final class TicketTypeEnum {

        /**
         * Enum ISSUES_TYPE_1000 for value: "issues_type_1000"
         */
        public static final TicketTypeEnum ISSUES_TYPE_1000 = new TicketTypeEnum("issues_type_1000");

        /**
         * Enum ISSUES_TYPE_2000 for value: "issues_type_2000"
         */
        public static final TicketTypeEnum ISSUES_TYPE_2000 = new TicketTypeEnum("issues_type_2000");

        /**
         * Enum ISSUES_TYPE_3000 for value: "issues_type_3000"
         */
        public static final TicketTypeEnum ISSUES_TYPE_3000 = new TicketTypeEnum("issues_type_3000");

        /**
         * Enum ISSUES_TYPE_4000 for value: "issues_type_4000"
         */
        public static final TicketTypeEnum ISSUES_TYPE_4000 = new TicketTypeEnum("issues_type_4000");

        /**
         * Enum ISSUES_TYPE_5000 for value: "issues_type_5000"
         */
        public static final TicketTypeEnum ISSUES_TYPE_5000 = new TicketTypeEnum("issues_type_5000");

        /**
         * Enum ISSUES_TYPE_6000 for value: "issues_type_6000"
         */
        public static final TicketTypeEnum ISSUES_TYPE_6000 = new TicketTypeEnum("issues_type_6000");

        /**
         * Enum ISSUES_TYPE_7000 for value: "issues_type_7000"
         */
        public static final TicketTypeEnum ISSUES_TYPE_7000 = new TicketTypeEnum("issues_type_7000");

        /**
         * Enum ISSUES_TYPE_8000 for value: "issues_type_8000"
         */
        public static final TicketTypeEnum ISSUES_TYPE_8000 = new TicketTypeEnum("issues_type_8000");

        /**
         * Enum ISSUES_TYPE_9000 for value: "issues_type_9000"
         */
        public static final TicketTypeEnum ISSUES_TYPE_9000 = new TicketTypeEnum("issues_type_9000");

        /**
         * Enum ISSUES_TYPE_10000 for value: "issues_type_10000"
         */
        public static final TicketTypeEnum ISSUES_TYPE_10000 = new TicketTypeEnum("issues_type_10000");

        /**
         * Enum ISSUES_TYPE_11000 for value: "issues_type_11000"
         */
        public static final TicketTypeEnum ISSUES_TYPE_11000 = new TicketTypeEnum("issues_type_11000");

        /**
         * Enum ISSUES_TYPE_12000 for value: "issues_type_12000"
         */
        public static final TicketTypeEnum ISSUES_TYPE_12000 = new TicketTypeEnum("issues_type_12000");

        /**
         * Enum ISSUES_TYPE_13000 for value: "issues_type_13000"
         */
        public static final TicketTypeEnum ISSUES_TYPE_13000 = new TicketTypeEnum("issues_type_13000");

        /**
         * Enum ISSUES_TYPE_14000 for value: "issues_type_14000"
         */
        public static final TicketTypeEnum ISSUES_TYPE_14000 = new TicketTypeEnum("issues_type_14000");

        /**
         * Enum ISSUES_TYPE_15000 for value: "issues_type_15000"
         */
        public static final TicketTypeEnum ISSUES_TYPE_15000 = new TicketTypeEnum("issues_type_15000");

        private static final Map<String, TicketTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TicketTypeEnum> createStaticFields() {
            Map<String, TicketTypeEnum> map = new HashMap<>();
            map.put("issues_type_1000", ISSUES_TYPE_1000);
            map.put("issues_type_2000", ISSUES_TYPE_2000);
            map.put("issues_type_3000", ISSUES_TYPE_3000);
            map.put("issues_type_4000", ISSUES_TYPE_4000);
            map.put("issues_type_5000", ISSUES_TYPE_5000);
            map.put("issues_type_6000", ISSUES_TYPE_6000);
            map.put("issues_type_7000", ISSUES_TYPE_7000);
            map.put("issues_type_8000", ISSUES_TYPE_8000);
            map.put("issues_type_9000", ISSUES_TYPE_9000);
            map.put("issues_type_10000", ISSUES_TYPE_10000);
            map.put("issues_type_11000", ISSUES_TYPE_11000);
            map.put("issues_type_12000", ISSUES_TYPE_12000);
            map.put("issues_type_13000", ISSUES_TYPE_13000);
            map.put("issues_type_14000", ISSUES_TYPE_14000);
            map.put("issues_type_15000", ISSUES_TYPE_15000);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TicketTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TicketTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TicketTypeEnum(value));
        }

        public static TicketTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TicketTypeEnum) {
                return this.value.equals(((TicketTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_type")

    private TicketTypeEnum ticketType;

    /**
     * 重现概率 issues_reproduce_probability_1000 有条件必现 issues_reproduce_probability_2000 有条件概率重现 issues_reproduce_probability_3000 无规律重现 issues_reproduce_probability_4000 很难重现
     */
    public static final class ReproduceProbabilityEnum {

        /**
         * Enum ISSUES_REPRODUCE_PROBABILITY_1000 for value: "issues_reproduce_probability_1000"
         */
        public static final ReproduceProbabilityEnum ISSUES_REPRODUCE_PROBABILITY_1000 =
            new ReproduceProbabilityEnum("issues_reproduce_probability_1000");

        /**
         * Enum ISSUES_REPRODUCE_PROBABILITY_2000 for value: "issues_reproduce_probability_2000"
         */
        public static final ReproduceProbabilityEnum ISSUES_REPRODUCE_PROBABILITY_2000 =
            new ReproduceProbabilityEnum("issues_reproduce_probability_2000");

        /**
         * Enum ISSUES_REPRODUCE_PROBABILITY_3000 for value: "issues_reproduce_probability_3000"
         */
        public static final ReproduceProbabilityEnum ISSUES_REPRODUCE_PROBABILITY_3000 =
            new ReproduceProbabilityEnum("issues_reproduce_probability_3000");

        /**
         * Enum ISSUES_REPRODUCE_PROBABILITY_4000 for value: "issues_reproduce_probability_4000"
         */
        public static final ReproduceProbabilityEnum ISSUES_REPRODUCE_PROBABILITY_4000 =
            new ReproduceProbabilityEnum("issues_reproduce_probability_4000");

        private static final Map<String, ReproduceProbabilityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReproduceProbabilityEnum> createStaticFields() {
            Map<String, ReproduceProbabilityEnum> map = new HashMap<>();
            map.put("issues_reproduce_probability_1000", ISSUES_REPRODUCE_PROBABILITY_1000);
            map.put("issues_reproduce_probability_2000", ISSUES_REPRODUCE_PROBABILITY_2000);
            map.put("issues_reproduce_probability_3000", ISSUES_REPRODUCE_PROBABILITY_3000);
            map.put("issues_reproduce_probability_4000", ISSUES_REPRODUCE_PROBABILITY_4000);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReproduceProbabilityEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ReproduceProbabilityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ReproduceProbabilityEnum(value));
        }

        public static ReproduceProbabilityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReproduceProbabilityEnum) {
                return this.value.equals(((ReproduceProbabilityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reproduce_probability")

    private ReproduceProbabilityEnum reproduceProbability;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_cause_cloud_service")

    private List<String> rootCauseCloudService = null;

    /**
     * 排班类型 参考：枚举 issues_mgmt_virtual_schedule_type_1000 排班,schedule_scenes排班场景,virtual_schedule_role排班角色必填,指定排班 issues_mgmt_virtual_schedule_type_2000 个人,issue_contact_person字段必填,指定责任人
     */
    public static final class VirtualScheduleTypeEnum {

        /**
         * Enum ISSUES_MGMT_VIRTUAL_SCHEDULE_TYPE_1000 for value: "issues_mgmt_virtual_schedule_type_1000"
         */
        public static final VirtualScheduleTypeEnum ISSUES_MGMT_VIRTUAL_SCHEDULE_TYPE_1000 =
            new VirtualScheduleTypeEnum("issues_mgmt_virtual_schedule_type_1000");

        /**
         * Enum ISSUES_MGMT_VIRTUAL_SCHEDULE_TYPE_2000 for value: "issues_mgmt_virtual_schedule_type_2000"
         */
        public static final VirtualScheduleTypeEnum ISSUES_MGMT_VIRTUAL_SCHEDULE_TYPE_2000 =
            new VirtualScheduleTypeEnum("issues_mgmt_virtual_schedule_type_2000");

        private static final Map<String, VirtualScheduleTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VirtualScheduleTypeEnum> createStaticFields() {
            Map<String, VirtualScheduleTypeEnum> map = new HashMap<>();
            map.put("issues_mgmt_virtual_schedule_type_1000", ISSUES_MGMT_VIRTUAL_SCHEDULE_TYPE_1000);
            map.put("issues_mgmt_virtual_schedule_type_2000", ISSUES_MGMT_VIRTUAL_SCHEDULE_TYPE_2000);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VirtualScheduleTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static VirtualScheduleTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VirtualScheduleTypeEnum(value));
        }

        public static VirtualScheduleTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VirtualScheduleTypeEnum) {
                return this.value.equals(((VirtualScheduleTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_schedule_type")

    private VirtualScheduleTypeEnum virtualScheduleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_scenes")

    private String scheduleScenes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_schedule_role")

    private String virtualScheduleRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_contact_person")

    private String issueContactPerson;

    public CreateExternalIssuesRequest withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建人id
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public CreateExternalIssuesRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CreateExternalIssuesRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateExternalIssuesRequest withRegions(List<String> regions) {
        this.regions = regions;
        return this;
    }

    public CreateExternalIssuesRequest addRegionsItem(String regionsItem) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        this.regions.add(regionsItem);
        return this;
    }

    public CreateExternalIssuesRequest withRegions(Consumer<List<String>> regionsSetter) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        regionsSetter.accept(this.regions);
        return this;
    }

    /**
     * 区域Code,最大100个
     * @return regions
     */
    public List<String> getRegions() {
        return regions;
    }

    public void setRegions(List<String> regions) {
        this.regions = regions;
    }

    public CreateExternalIssuesRequest withEnterpriseProject(String enterpriseProject) {
        this.enterpriseProject = enterpriseProject;
        return this;
    }

    /**
     * 企业项目id
     * @return enterpriseProject
     */
    public String getEnterpriseProject() {
        return enterpriseProject;
    }

    public void setEnterpriseProject(String enterpriseProject) {
        this.enterpriseProject = enterpriseProject;
    }

    public CreateExternalIssuesRequest withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 问题来源 issues_source_1000 事件 issues_source_2000 Warroom issues_source_3000 告警
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public CreateExternalIssuesRequest withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 问题来源id
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public CreateExternalIssuesRequest withFountTime(Long fountTime) {
        this.fountTime = fountTime;
        return this;
    }

    /**
     * 发现时间
     * minimum: 1
     * maximum: 9999999999999
     * @return fountTime
     */
    public Long getFountTime() {
        return fountTime;
    }

    public void setFountTime(Long fountTime) {
        this.fountTime = fountTime;
    }

    public CreateExternalIssuesRequest withImpactedCloudServices(List<String> impactedCloudServices) {
        this.impactedCloudServices = impactedCloudServices;
        return this;
    }

    public CreateExternalIssuesRequest addImpactedCloudServicesItem(String impactedCloudServicesItem) {
        if (this.impactedCloudServices == null) {
            this.impactedCloudServices = new ArrayList<>();
        }
        this.impactedCloudServices.add(impactedCloudServicesItem);
        return this;
    }

    public CreateExternalIssuesRequest withImpactedCloudServices(Consumer<List<String>> impactedCloudServicesSetter) {
        if (this.impactedCloudServices == null) {
            this.impactedCloudServices = new ArrayList<>();
        }
        impactedCloudServicesSetter.accept(this.impactedCloudServices);
        return this;
    }

    /**
     * 影响应用ID，最多10条
     * @return impactedCloudServices
     */
    public List<String> getImpactedCloudServices() {
        return impactedCloudServices;
    }

    public void setImpactedCloudServices(List<String> impactedCloudServices) {
        this.impactedCloudServices = impactedCloudServices;
    }

    public CreateExternalIssuesRequest withLevel(LevelEnum level) {
        this.level = level;
        return this;
    }

    /**
     * 问题级别 issues_level_1000 致命 issues_level_2000 严重 issues_level_3000 一般
     * @return level
     */
    public LevelEnum getLevel() {
        return level;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    public CreateExternalIssuesRequest withTicketType(TicketTypeEnum ticketType) {
        this.ticketType = ticketType;
        return this;
    }

    /**
     * 问题类型 issues_type_1000  功能性问题 issues_type_2000  性能问题 issues_type_3000  可靠性问题 issues_type_4000  兼容性问题 issues_type_5000  用户体验问题 issues_type_6000  可维护性问题 issues_type_7000  变更类问题 issues_type_8000  安全问题 issues_type_9000  工程实施类 issues_type_10000 交付部署问题 issues_type_11000 LLD规划问题 issues_type_12000 供用商问题 issues_type_13000 咨询类问题 issues_type_14000 需求类问题 issues_type_15000 其他问题
     * @return ticketType
     */
    public TicketTypeEnum getTicketType() {
        return ticketType;
    }

    public void setTicketType(TicketTypeEnum ticketType) {
        this.ticketType = ticketType;
    }

    public CreateExternalIssuesRequest withReproduceProbability(ReproduceProbabilityEnum reproduceProbability) {
        this.reproduceProbability = reproduceProbability;
        return this;
    }

    /**
     * 重现概率 issues_reproduce_probability_1000 有条件必现 issues_reproduce_probability_2000 有条件概率重现 issues_reproduce_probability_3000 无规律重现 issues_reproduce_probability_4000 很难重现
     * @return reproduceProbability
     */
    public ReproduceProbabilityEnum getReproduceProbability() {
        return reproduceProbability;
    }

    public void setReproduceProbability(ReproduceProbabilityEnum reproduceProbability) {
        this.reproduceProbability = reproduceProbability;
    }

    public CreateExternalIssuesRequest withRootCauseCloudService(List<String> rootCauseCloudService) {
        this.rootCauseCloudService = rootCauseCloudService;
        return this;
    }

    public CreateExternalIssuesRequest addRootCauseCloudServiceItem(String rootCauseCloudServiceItem) {
        if (this.rootCauseCloudService == null) {
            this.rootCauseCloudService = new ArrayList<>();
        }
        this.rootCauseCloudService.add(rootCauseCloudServiceItem);
        return this;
    }

    public CreateExternalIssuesRequest withRootCauseCloudService(Consumer<List<String>> rootCauseCloudServiceSetter) {
        if (this.rootCauseCloudService == null) {
            this.rootCauseCloudService = new ArrayList<>();
        }
        rootCauseCloudServiceSetter.accept(this.rootCauseCloudService);
        return this;
    }

    /**
     * 责任应用ID，必填,限1条
     * @return rootCauseCloudService
     */
    public List<String> getRootCauseCloudService() {
        return rootCauseCloudService;
    }

    public void setRootCauseCloudService(List<String> rootCauseCloudService) {
        this.rootCauseCloudService = rootCauseCloudService;
    }

    public CreateExternalIssuesRequest withVirtualScheduleType(VirtualScheduleTypeEnum virtualScheduleType) {
        this.virtualScheduleType = virtualScheduleType;
        return this;
    }

    /**
     * 排班类型 参考：枚举 issues_mgmt_virtual_schedule_type_1000 排班,schedule_scenes排班场景,virtual_schedule_role排班角色必填,指定排班 issues_mgmt_virtual_schedule_type_2000 个人,issue_contact_person字段必填,指定责任人
     * @return virtualScheduleType
     */
    public VirtualScheduleTypeEnum getVirtualScheduleType() {
        return virtualScheduleType;
    }

    public void setVirtualScheduleType(VirtualScheduleTypeEnum virtualScheduleType) {
        this.virtualScheduleType = virtualScheduleType;
    }

    public CreateExternalIssuesRequest withScheduleScenes(String scheduleScenes) {
        this.scheduleScenes = scheduleScenes;
        return this;
    }

    /**
     * 排班场景id
     * @return scheduleScenes
     */
    public String getScheduleScenes() {
        return scheduleScenes;
    }

    public void setScheduleScenes(String scheduleScenes) {
        this.scheduleScenes = scheduleScenes;
    }

    public CreateExternalIssuesRequest withVirtualScheduleRole(String virtualScheduleRole) {
        this.virtualScheduleRole = virtualScheduleRole;
        return this;
    }

    /**
     * 排班角色id
     * @return virtualScheduleRole
     */
    public String getVirtualScheduleRole() {
        return virtualScheduleRole;
    }

    public void setVirtualScheduleRole(String virtualScheduleRole) {
        this.virtualScheduleRole = virtualScheduleRole;
    }

    public CreateExternalIssuesRequest withIssueContactPerson(String issueContactPerson) {
        this.issueContactPerson = issueContactPerson;
        return this;
    }

    /**
     * 问题责任人id
     * @return issueContactPerson
     */
    public String getIssueContactPerson() {
        return issueContactPerson;
    }

    public void setIssueContactPerson(String issueContactPerson) {
        this.issueContactPerson = issueContactPerson;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateExternalIssuesRequest that = (CreateExternalIssuesRequest) obj;
        return Objects.equals(this.creator, that.creator) && Objects.equals(this.title, that.title)
            && Objects.equals(this.description, that.description) && Objects.equals(this.regions, that.regions)
            && Objects.equals(this.enterpriseProject, that.enterpriseProject)
            && Objects.equals(this.source, that.source) && Objects.equals(this.sourceId, that.sourceId)
            && Objects.equals(this.fountTime, that.fountTime)
            && Objects.equals(this.impactedCloudServices, that.impactedCloudServices)
            && Objects.equals(this.level, that.level) && Objects.equals(this.ticketType, that.ticketType)
            && Objects.equals(this.reproduceProbability, that.reproduceProbability)
            && Objects.equals(this.rootCauseCloudService, that.rootCauseCloudService)
            && Objects.equals(this.virtualScheduleType, that.virtualScheduleType)
            && Objects.equals(this.scheduleScenes, that.scheduleScenes)
            && Objects.equals(this.virtualScheduleRole, that.virtualScheduleRole)
            && Objects.equals(this.issueContactPerson, that.issueContactPerson);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creator,
            title,
            description,
            regions,
            enterpriseProject,
            source,
            sourceId,
            fountTime,
            impactedCloudServices,
            level,
            ticketType,
            reproduceProbability,
            rootCauseCloudService,
            virtualScheduleType,
            scheduleScenes,
            virtualScheduleRole,
            issueContactPerson);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateExternalIssuesRequest {\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
        sb.append("    enterpriseProject: ").append(toIndentedString(enterpriseProject)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    fountTime: ").append(toIndentedString(fountTime)).append("\n");
        sb.append("    impactedCloudServices: ").append(toIndentedString(impactedCloudServices)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
        sb.append("    reproduceProbability: ").append(toIndentedString(reproduceProbability)).append("\n");
        sb.append("    rootCauseCloudService: ").append(toIndentedString(rootCauseCloudService)).append("\n");
        sb.append("    virtualScheduleType: ").append(toIndentedString(virtualScheduleType)).append("\n");
        sb.append("    scheduleScenes: ").append(toIndentedString(scheduleScenes)).append("\n");
        sb.append("    virtualScheduleRole: ").append(toIndentedString(virtualScheduleRole)).append("\n");
        sb.append("    issueContactPerson: ").append(toIndentedString(issueContactPerson)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
