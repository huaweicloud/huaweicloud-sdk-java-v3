package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListHistoryOperateLogsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="authorization_id")
    
    private Long authorizationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="authorization_detail_id")
    
    private Long authorizationDetailId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="session_id")
    
    private Long sessionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sort")
    
    private Integer sort;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Site")
    
    private Integer xSite;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Time-Zone")
    
    private String xTimeZone;

    public ListHistoryOperateLogsRequest withAuthorizationId(Long authorizationId) {
        this.authorizationId = authorizationId;
        return this;
    }

    


    /**
     * 授权id
     * minimum: 0
     * maximum: 9223372036854775807
     * @return authorizationId
     */
    public Long getAuthorizationId() {
        return authorizationId;
    }

    public void setAuthorizationId(Long authorizationId) {
        this.authorizationId = authorizationId;
    }

    

    public ListHistoryOperateLogsRequest withAuthorizationDetailId(Long authorizationDetailId) {
        this.authorizationDetailId = authorizationDetailId;
        return this;
    }

    


    /**
     * 授权详情id
     * minimum: 0
     * maximum: 9223372036854775807
     * @return authorizationDetailId
     */
    public Long getAuthorizationDetailId() {
        return authorizationDetailId;
    }

    public void setAuthorizationDetailId(Long authorizationDetailId) {
        this.authorizationDetailId = authorizationDetailId;
    }

    

    public ListHistoryOperateLogsRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    


    /**
     * IAM组id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    

    public ListHistoryOperateLogsRequest withSessionId(Long sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    


    /**
     * 会话id
     * minimum: 0
     * maximum: 9223372036854775807
     * @return sessionId
     */
    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    

    public ListHistoryOperateLogsRequest withSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    


    /**
     * 1：按操作时间升序； 0：按操作时间降序；默认0
     * minimum: 0
     * maximum: 1
     * @return sort
     */
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    

    public ListHistoryOperateLogsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 查询偏移量
     * minimum: 0
     * maximum: 65535
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public ListHistoryOperateLogsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 查询限制条数
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListHistoryOperateLogsRequest withXSite(Integer xSite) {
        this.xSite = xSite;
        return this;
    }

    


    /**
     * 对接站点信息。  0（中国站） 1（国际站），不填的话默认为0。
     * minimum: 0
     * maximum: 1
     * @return xSite
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Site")
    public Integer getXSite() {
        return xSite;
    }

    public void setXSite(Integer xSite) {
        this.xSite = xSite;
    }

    

    public ListHistoryOperateLogsRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * 语言环境，值为通用的语言描述字符串，比如zh-cn等，默认为zh-cn。  会根据语言环境对应展示一些国际化的信息，比如工单类型名称等。
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    

    public ListHistoryOperateLogsRequest withXTimeZone(String xTimeZone) {
        this.xTimeZone = xTimeZone;
        return this;
    }

    


    /**
     * 环境时区，值为通用的时区描述字符串，比如GMT+8等，默认为GMT+8。  涉及时间的数据会根据环境时区处理。
     * @return xTimeZone
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Time-Zone")
    public String getXTimeZone() {
        return xTimeZone;
    }

    public void setXTimeZone(String xTimeZone) {
        this.xTimeZone = xTimeZone;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListHistoryOperateLogsRequest listHistoryOperateLogsRequest = (ListHistoryOperateLogsRequest) o;
        return Objects.equals(this.authorizationId, listHistoryOperateLogsRequest.authorizationId) &&
            Objects.equals(this.authorizationDetailId, listHistoryOperateLogsRequest.authorizationDetailId) &&
            Objects.equals(this.groupId, listHistoryOperateLogsRequest.groupId) &&
            Objects.equals(this.sessionId, listHistoryOperateLogsRequest.sessionId) &&
            Objects.equals(this.sort, listHistoryOperateLogsRequest.sort) &&
            Objects.equals(this.offset, listHistoryOperateLogsRequest.offset) &&
            Objects.equals(this.limit, listHistoryOperateLogsRequest.limit) &&
            Objects.equals(this.xSite, listHistoryOperateLogsRequest.xSite) &&
            Objects.equals(this.xLanguage, listHistoryOperateLogsRequest.xLanguage) &&
            Objects.equals(this.xTimeZone, listHistoryOperateLogsRequest.xTimeZone);
    }
    @Override
    public int hashCode() {
        return Objects.hash(authorizationId, authorizationDetailId, groupId, sessionId, sort, offset, limit, xSite, xLanguage, xTimeZone);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHistoryOperateLogsRequest {\n");
        sb.append("    authorizationId: ").append(toIndentedString(authorizationId)).append("\n");
        sb.append("    authorizationDetailId: ").append(toIndentedString(authorizationDetailId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    xSite: ").append(toIndentedString(xSite)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    xTimeZone: ").append(toIndentedString(xTimeZone)).append("\n");
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

