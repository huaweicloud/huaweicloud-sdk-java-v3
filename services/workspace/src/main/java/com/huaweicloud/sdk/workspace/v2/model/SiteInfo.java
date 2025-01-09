package com.huaweicloud.sdk.workspace.v2.model;

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
 * 站点信息
 */
public class SiteInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_id")

    private String siteId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_name")

    private String siteName;

    /**
     * 配置状态。 - CENTER： 中心初始化 - IES： 边缘初始化
     */
    public static final class SiteTypeEnum {

        /**
         * Enum CENTER for value: "CENTER"
         */
        public static final SiteTypeEnum CENTER = new SiteTypeEnum("CENTER");

        /**
         * Enum IES for value: "IES"
         */
        public static final SiteTypeEnum IES = new SiteTypeEnum("IES");

        private static final Map<String, SiteTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SiteTypeEnum> createStaticFields() {
            Map<String, SiteTypeEnum> map = new HashMap<>();
            map.put("CENTER", CENTER);
            map.put("IES", IES);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SiteTypeEnum(String value) {
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
        public static SiteTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SiteTypeEnum(value));
        }

        public static SiteTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SiteTypeEnum) {
                return this.value.equals(((SiteTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_type")

    private SiteTypeEnum siteType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_info")

    private List<Vag> agentInfo = null;

    public SiteInfo withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    /**
     * 站点id
     * @return siteId
     */
    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public SiteInfo withSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }

    /**
     * 站点名字
     * @return siteName
     */
    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public SiteInfo withSiteType(SiteTypeEnum siteType) {
        this.siteType = siteType;
        return this;
    }

    /**
     * 配置状态。 - CENTER： 中心初始化 - IES： 边缘初始化
     * @return siteType
     */
    public SiteTypeEnum getSiteType() {
        return siteType;
    }

    public void setSiteType(SiteTypeEnum siteType) {
        this.siteType = siteType;
    }

    public SiteInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public SiteInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 站点状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SiteInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public SiteInfo withAgentInfo(List<Vag> agentInfo) {
        this.agentInfo = agentInfo;
        return this;
    }

    public SiteInfo addAgentInfoItem(Vag agentInfoItem) {
        if (this.agentInfo == null) {
            this.agentInfo = new ArrayList<>();
        }
        this.agentInfo.add(agentInfoItem);
        return this;
    }

    public SiteInfo withAgentInfo(Consumer<List<Vag>> agentInfoSetter) {
        if (this.agentInfo == null) {
            this.agentInfo = new ArrayList<>();
        }
        agentInfoSetter.accept(this.agentInfo);
        return this;
    }

    /**
     * 网关节点信息
     * @return agentInfo
     */
    public List<Vag> getAgentInfo() {
        return agentInfo;
    }

    public void setAgentInfo(List<Vag> agentInfo) {
        this.agentInfo = agentInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SiteInfo that = (SiteInfo) obj;
        return Objects.equals(this.siteId, that.siteId) && Objects.equals(this.siteName, that.siteName)
            && Objects.equals(this.siteType, that.siteType) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.agentInfo, that.agentInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteId, siteName, siteType, projectId, status, createTime, agentInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SiteInfo {\n");
        sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
        sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
        sb.append("    siteType: ").append(toIndentedString(siteType)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    agentInfo: ").append(toIndentedString(agentInfo)).append("\n");
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
