package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Request Object */
public class ListPremiumHostRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private String page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pagesize")

    private String pagesize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostname")

    private String hostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyname")

    private String policyname;

    /** 域名防护状态： - -1：bypass，该域名的请求直接到达其后端服务器，不再经过WAF - 0：暂停防护，WAF只转发该域名的请求，不做攻击检测 - 1：开启防护，WAF根据您配置的策略进行攻击检测 */
    public static final class ProtectStatusEnum {

        /** Enum NUMBER_MINUS_1 for value: -1 */
        public static final ProtectStatusEnum NUMBER_MINUS_1 = new ProtectStatusEnum(-1);

        /** Enum NUMBER_0 for value: 0 */
        public static final ProtectStatusEnum NUMBER_0 = new ProtectStatusEnum(0);

        /** Enum NUMBER_1 for value: 1 */
        public static final ProtectStatusEnum NUMBER_1 = new ProtectStatusEnum(1);

        private static final Map<Integer, ProtectStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ProtectStatusEnum> createStaticFields() {
            Map<Integer, ProtectStatusEnum> map = new HashMap<>();
            map.put(-1, NUMBER_MINUS_1);
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ProtectStatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProtectStatusEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            ProtectStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtectStatusEnum(value);
            }
            return result;
        }

        public static ProtectStatusEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            ProtectStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtectStatusEnum) {
                return this.value.equals(((ProtectStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private ProtectStatusEnum protectStatus;

    public ListPremiumHostRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 您可以通过调用企业项目管理服务（EPS)的查询企业项目列表接口（ListEnterpriseProject）查询企业项目id
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListPremiumHostRequest withPage(String page) {
        this.page = page;
        return this;
    }

    /** 分页查询时，返回第几页数据。范围0-100000，默认值为1，表示返回第1页数据。
     * 
     * @return page */
    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public ListPremiumHostRequest withPagesize(String pagesize) {
        this.pagesize = pagesize;
        return this;
    }

    /** 分页查询时，每页包含多少条结果。范围1-100，默认值为10，表示每页包含10条结果。
     * 
     * @return pagesize */
    public String getPagesize() {
        return pagesize;
    }

    public void setPagesize(String pagesize) {
        this.pagesize = pagesize;
    }

    public ListPremiumHostRequest withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /** 域名
     * 
     * @return hostname */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public ListPremiumHostRequest withPolicyname(String policyname) {
        this.policyname = policyname;
        return this;
    }

    /** 策略名称
     * 
     * @return policyname */
    public String getPolicyname() {
        return policyname;
    }

    public void setPolicyname(String policyname) {
        this.policyname = policyname;
    }

    public ListPremiumHostRequest withProtectStatus(ProtectStatusEnum protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /** 域名防护状态： - -1：bypass，该域名的请求直接到达其后端服务器，不再经过WAF - 0：暂停防护，WAF只转发该域名的请求，不做攻击检测 - 1：开启防护，WAF根据您配置的策略进行攻击检测
     * 
     * @return protectStatus */
    public ProtectStatusEnum getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(ProtectStatusEnum protectStatus) {
        this.protectStatus = protectStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPremiumHostRequest listPremiumHostRequest = (ListPremiumHostRequest) o;
        return Objects.equals(this.enterpriseProjectId, listPremiumHostRequest.enterpriseProjectId)
            && Objects.equals(this.page, listPremiumHostRequest.page)
            && Objects.equals(this.pagesize, listPremiumHostRequest.pagesize)
            && Objects.equals(this.hostname, listPremiumHostRequest.hostname)
            && Objects.equals(this.policyname, listPremiumHostRequest.policyname)
            && Objects.equals(this.protectStatus, listPremiumHostRequest.protectStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, page, pagesize, hostname, policyname, protectStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPremiumHostRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pagesize: ").append(toIndentedString(pagesize)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    policyname: ").append(toIndentedString(policyname)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
