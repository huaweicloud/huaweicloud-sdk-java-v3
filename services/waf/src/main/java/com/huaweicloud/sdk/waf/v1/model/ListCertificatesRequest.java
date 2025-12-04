package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListCertificatesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pagesize")

    private Integer pagesize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private Boolean host;

    /**
     * **参数解释：** 证书过期状态 **约束限制：** 不涉及 **取值范围：**  - 0:未过期  - 1:已过期  - 2:即将过期（证书将在一个月内过期）  **默认取值：** 不涉及
     */
    public static final class ExpStatusEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final ExpStatusEnum NUMBER_0 = new ExpStatusEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ExpStatusEnum NUMBER_1 = new ExpStatusEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final ExpStatusEnum NUMBER_2 = new ExpStatusEnum(2);

        private static final Map<Integer, ExpStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ExpStatusEnum> createStaticFields() {
            Map<Integer, ExpStatusEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ExpStatusEnum(Integer value) {
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
        public static ExpStatusEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ExpStatusEnum(value));
        }

        public static ExpStatusEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ExpStatusEnum) {
                return this.value.equals(((ExpStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exp_status")

    private ExpStatusEnum expStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_scm")

    private Boolean queryScm;

    public ListCertificatesRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 您可以通过调用企业项目管理服务（EPS）的查询企业项目列表接口（ListEnterpriseProject）查询企业项目id。若需要查询当前用户所有企业项目绑定的资源信息，请传参all_granted_eps。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListCertificatesRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * 分页查询时，返回第几页数据。默认值为1，表示返回第1页数据。
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ListCertificatesRequest withPagesize(Integer pagesize) {
        this.pagesize = pagesize;
        return this;
    }

    /**
     * 分页查询时，每页包含多少条结果。范围1-100，默认值为10，表示每页包含10条结果。
     * @return pagesize
     */
    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    public ListCertificatesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 证书名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListCertificatesRequest withHost(Boolean host) {
        this.host = host;
        return this;
    }

    /**
     * 是否获取证书关联的域名，默认为false   -true:获取已关联域名的证书   -false:获取未关联域名的证书
     * @return host
     */
    public Boolean getHost() {
        return host;
    }

    public void setHost(Boolean host) {
        this.host = host;
    }

    public ListCertificatesRequest withExpStatus(ExpStatusEnum expStatus) {
        this.expStatus = expStatus;
        return this;
    }

    /**
     * **参数解释：** 证书过期状态 **约束限制：** 不涉及 **取值范围：**  - 0:未过期  - 1:已过期  - 2:即将过期（证书将在一个月内过期）  **默认取值：** 不涉及
     * @return expStatus
     */
    public ExpStatusEnum getExpStatus() {
        return expStatus;
    }

    public void setExpStatus(ExpStatusEnum expStatus) {
        this.expStatus = expStatus;
    }

    public ListCertificatesRequest withQueryScm(Boolean queryScm) {
        this.queryScm = queryScm;
        return this;
    }

    /**
     * 查询结果的证书来源服务是否包括SCM服务，值为true或者false。
     * @return queryScm
     */
    public Boolean getQueryScm() {
        return queryScm;
    }

    public void setQueryScm(Boolean queryScm) {
        this.queryScm = queryScm;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCertificatesRequest that = (ListCertificatesRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.page, that.page) && Objects.equals(this.pagesize, that.pagesize)
            && Objects.equals(this.name, that.name) && Objects.equals(this.host, that.host)
            && Objects.equals(this.expStatus, that.expStatus) && Objects.equals(this.queryScm, that.queryScm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, page, pagesize, name, host, expStatus, queryScm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCertificatesRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pagesize: ").append(toIndentedString(pagesize)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    expStatus: ").append(toIndentedString(expStatus)).append("\n");
        sb.append("    queryScm: ").append(toIndentedString(queryScm)).append("\n");
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
