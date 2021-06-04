package com.huaweicloud.sdk.cdn.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cdn.v1.model.DomainOriginHost;
import com.huaweicloud.sdk.cdn.v1.model.SourceWithPort;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 域名信息
 */
public class Domains  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_name")
    
    private String domainName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="business_type")
    
    private String businessType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_domain_id")
    
    private String userDomainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_status")
    
    private String domainStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cname")
    
    private String cname;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sources")
    
    private List<SourceWithPort> sources = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_origin_host")
    
    private DomainOriginHost domainOriginHost;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="https_status")
    
    private Integer httpsStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private Long createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="modify_time")
    
    private Long modifyTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="disabled")
    
    private Integer disabled;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="locked")
    
    private Integer locked;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auto_refresh_preheat")
    
    private Integer autoRefreshPreheat;
    /**
     * 华为云CDN提供的加速服务范围，包含：mainland_china中国大陆、outside_mainland_china中国大陆境外、global全球。
     */
    public static final class ServiceAreaEnum {

        
        /**
         * Enum MAINLAND_CHINA for value: "mainland_china"
         */
        public static final ServiceAreaEnum MAINLAND_CHINA = new ServiceAreaEnum("mainland_china");
        
        /**
         * Enum OUTSIDE_MAINLAND_CHINA for value: "outside_mainland_china"
         */
        public static final ServiceAreaEnum OUTSIDE_MAINLAND_CHINA = new ServiceAreaEnum("outside_mainland_china");
        
        /**
         * Enum GLOBAL for value: "global"
         */
        public static final ServiceAreaEnum GLOBAL = new ServiceAreaEnum("global");
        

        private static final Map<String, ServiceAreaEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ServiceAreaEnum> createStaticFields() {
            Map<String, ServiceAreaEnum> map = new HashMap<>();
            map.put("mainland_china", MAINLAND_CHINA);
            map.put("outside_mainland_china", OUTSIDE_MAINLAND_CHINA);
            map.put("global", GLOBAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ServiceAreaEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ServiceAreaEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ServiceAreaEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ServiceAreaEnum(value);
            }
            return result;
        }

        public static ServiceAreaEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ServiceAreaEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ServiceAreaEnum) {
                return this.value.equals(((ServiceAreaEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_area")
    
    private ServiceAreaEnum serviceArea;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="range_status")
    
    private String rangeStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="follow_status")
    
    private String followStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="origin_status")
    
    private String originStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="banned_reason")
    
    private String bannedReason;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="locked_reason")
    
    private String lockedReason;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;

    public Domains withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 加速域名ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public Domains withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    


    /**
     * 加速域名。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    

    public Domains withBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }

    


    /**
     * 域名业务类型，若为web，则表示类型为静态加速；若为download，则表示业务类型为下载加速；若为video，则表示业务类型为流媒体加速；若为wholeSite，则表示类型为全站加速。
     * @return businessType
     */
    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    

    public Domains withUserDomainId(String userDomainId) {
        this.userDomainId = userDomainId;
        return this;
    }

    


    /**
     * 域名所属用户的domain_id。
     * @return userDomainId
     */
    public String getUserDomainId() {
        return userDomainId;
    }

    public void setUserDomainId(String userDomainId) {
        this.userDomainId = userDomainId;
    }

    

    public Domains withDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }

    


    /**
     * 加速域名状态。取值意义： - online表示“已开启” - offline表示“已停用” - configuring表示“配置中” - configure_failed表示“配置失败” - checking表示“审核中” - check_failed表示“审核失败” - deleting表示“删除中”
     * @return domainStatus
     */
    public String getDomainStatus() {
        return domainStatus;
    }

    public void setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
    }

    

    public Domains withCname(String cname) {
        this.cname = cname;
        return this;
    }

    


    /**
     * 加速域名对应的CNAME。
     * @return cname
     */
    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    

    public Domains withSources(List<SourceWithPort> sources) {
        this.sources = sources;
        return this;
    }

    
    public Domains addSourcesItem(SourceWithPort sourcesItem) {
        if(this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    public Domains withSources(Consumer<List<SourceWithPort>> sourcesSetter) {
        if(this.sources == null) {
            this.sources = new ArrayList<>();
        }
        sourcesSetter.accept(this.sources);
        return this;
    }

    /**
     * 源站域名或源站IP，IP仅支持IPv4，多个源站IP之间以英文逗号间隔，最多支持10个源站IP。
     * @return sources
     */
    public List<SourceWithPort> getSources() {
        return sources;
    }

    public void setSources(List<SourceWithPort> sources) {
        this.sources = sources;
    }

    

    public Domains withDomainOriginHost(DomainOriginHost domainOriginHost) {
        this.domainOriginHost = domainOriginHost;
        return this;
    }

    public Domains withDomainOriginHost(Consumer<DomainOriginHost> domainOriginHostSetter) {
        if(this.domainOriginHost == null ){
            this.domainOriginHost = new DomainOriginHost();
            domainOriginHostSetter.accept(this.domainOriginHost);
        }
        
        return this;
    }


    /**
     * Get domainOriginHost
     * @return domainOriginHost
     */
    public DomainOriginHost getDomainOriginHost() {
        return domainOriginHost;
    }

    public void setDomainOriginHost(DomainOriginHost domainOriginHost) {
        this.domainOriginHost = domainOriginHost;
    }

    

    public Domains withHttpsStatus(Integer httpsStatus) {
        this.httpsStatus = httpsStatus;
        return this;
    }

    


    /**
     * 是否开启HTTPS加速。
     * @return httpsStatus
     */
    public Integer getHttpsStatus() {
        return httpsStatus;
    }

    public void setHttpsStatus(Integer httpsStatus) {
        this.httpsStatus = httpsStatus;
    }

    

    public Domains withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 域名创建时间，相对于UTC 1970-01-01到当前时间相隔的毫秒数。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    

    public Domains withModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    


    /**
     * 域名修改时间，相对于UTC 1970-01-01到当前时间相隔的毫秒数。
     * @return modifyTime
     */
    public Long getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }

    

    public Domains withDisabled(Integer disabled) {
        this.disabled = disabled;
        return this;
    }

    


    /**
     * 封禁状态（0代表未禁用；1代表禁用）。
     * @return disabled
     */
    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }

    

    public Domains withLocked(Integer locked) {
        this.locked = locked;
        return this;
    }

    


    /**
     * 锁定状态（0代表未锁定；1代表锁定）。
     * @return locked
     */
    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    

    public Domains withAutoRefreshPreheat(Integer autoRefreshPreheat) {
        this.autoRefreshPreheat = autoRefreshPreheat;
        return this;
    }

    


    /**
     * 自动刷新预热（0代表关闭；1代表打开）
     * @return autoRefreshPreheat
     */
    public Integer getAutoRefreshPreheat() {
        return autoRefreshPreheat;
    }

    public void setAutoRefreshPreheat(Integer autoRefreshPreheat) {
        this.autoRefreshPreheat = autoRefreshPreheat;
    }

    

    public Domains withServiceArea(ServiceAreaEnum serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }

    


    /**
     * 华为云CDN提供的加速服务范围，包含：mainland_china中国大陆、outside_mainland_china中国大陆境外、global全球。
     * @return serviceArea
     */
    public ServiceAreaEnum getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(ServiceAreaEnum serviceArea) {
        this.serviceArea = serviceArea;
    }

    

    public Domains withRangeStatus(String rangeStatus) {
        this.rangeStatus = rangeStatus;
        return this;
    }

    


    /**
     * Range回源状态。
     * @return rangeStatus
     */
    public String getRangeStatus() {
        return rangeStatus;
    }

    public void setRangeStatus(String rangeStatus) {
        this.rangeStatus = rangeStatus;
    }

    

    public Domains withFollowStatus(String followStatus) {
        this.followStatus = followStatus;
        return this;
    }

    


    /**
     * 回源跟随状态。
     * @return followStatus
     */
    public String getFollowStatus() {
        return followStatus;
    }

    public void setFollowStatus(String followStatus) {
        this.followStatus = followStatus;
    }

    

    public Domains withOriginStatus(String originStatus) {
        this.originStatus = originStatus;
        return this;
    }

    


    /**
     * 是否暂停源站回源
     * @return originStatus
     */
    public String getOriginStatus() {
        return originStatus;
    }

    public void setOriginStatus(String originStatus) {
        this.originStatus = originStatus;
    }

    

    public Domains withBannedReason(String bannedReason) {
        this.bannedReason = bannedReason;
        return this;
    }

    


    /**
     * 域名禁用原因
     * @return bannedReason
     */
    public String getBannedReason() {
        return bannedReason;
    }

    public void setBannedReason(String bannedReason) {
        this.bannedReason = bannedReason;
    }

    

    public Domains withLockedReason(String lockedReason) {
        this.lockedReason = lockedReason;
        return this;
    }

    


    /**
     * 域名锁定原因
     * @return lockedReason
     */
    public String getLockedReason() {
        return lockedReason;
    }

    public void setLockedReason(String lockedReason) {
        this.lockedReason = lockedReason;
    }

    

    public Domains withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 当用户开启企业项目功能时返回该参数，表示域名资源所属企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Domains domains = (Domains) o;
        return Objects.equals(this.id, domains.id) &&
            Objects.equals(this.domainName, domains.domainName) &&
            Objects.equals(this.businessType, domains.businessType) &&
            Objects.equals(this.userDomainId, domains.userDomainId) &&
            Objects.equals(this.domainStatus, domains.domainStatus) &&
            Objects.equals(this.cname, domains.cname) &&
            Objects.equals(this.sources, domains.sources) &&
            Objects.equals(this.domainOriginHost, domains.domainOriginHost) &&
            Objects.equals(this.httpsStatus, domains.httpsStatus) &&
            Objects.equals(this.createTime, domains.createTime) &&
            Objects.equals(this.modifyTime, domains.modifyTime) &&
            Objects.equals(this.disabled, domains.disabled) &&
            Objects.equals(this.locked, domains.locked) &&
            Objects.equals(this.autoRefreshPreheat, domains.autoRefreshPreheat) &&
            Objects.equals(this.serviceArea, domains.serviceArea) &&
            Objects.equals(this.rangeStatus, domains.rangeStatus) &&
            Objects.equals(this.followStatus, domains.followStatus) &&
            Objects.equals(this.originStatus, domains.originStatus) &&
            Objects.equals(this.bannedReason, domains.bannedReason) &&
            Objects.equals(this.lockedReason, domains.lockedReason) &&
            Objects.equals(this.enterpriseProjectId, domains.enterpriseProjectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, domainName, businessType, userDomainId, domainStatus, cname, sources, domainOriginHost, httpsStatus, createTime, modifyTime, disabled, locked, autoRefreshPreheat, serviceArea, rangeStatus, followStatus, originStatus, bannedReason, lockedReason, enterpriseProjectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Domains {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
        sb.append("    userDomainId: ").append(toIndentedString(userDomainId)).append("\n");
        sb.append("    domainStatus: ").append(toIndentedString(domainStatus)).append("\n");
        sb.append("    cname: ").append(toIndentedString(cname)).append("\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
        sb.append("    domainOriginHost: ").append(toIndentedString(domainOriginHost)).append("\n");
        sb.append("    httpsStatus: ").append(toIndentedString(httpsStatus)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    autoRefreshPreheat: ").append(toIndentedString(autoRefreshPreheat)).append("\n");
        sb.append("    serviceArea: ").append(toIndentedString(serviceArea)).append("\n");
        sb.append("    rangeStatus: ").append(toIndentedString(rangeStatus)).append("\n");
        sb.append("    followStatus: ").append(toIndentedString(followStatus)).append("\n");
        sb.append("    originStatus: ").append(toIndentedString(originStatus)).append("\n");
        sb.append("    bannedReason: ").append(toIndentedString(bannedReason)).append("\n");
        sb.append("    lockedReason: ").append(toIndentedString(lockedReason)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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

