package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作项详情响应
 */
public class IssueDetailsResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stay_days")

    private Integer stayDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_date")

    private String createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_level")

    private SecurityLevelResult securityLevel;

    public IssueDetailsResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 工作项ID。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IssueDetailsResponse withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * **参数解释**： 工作项编号。 **取值范围**： 不涉及。
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public IssueDetailsResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 工作项类型。 **取值范围**： 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public IssueDetailsResponse withStayDays(Integer stayDays) {
        this.stayDays = stayDays;
        return this;
    }

    /**
     * **参数解释**： 停留天数。 **取值范围**： 不涉及。
     * @return stayDays
     */
    public Integer getStayDays() {
        return stayDays;
    }

    public void setStayDays(Integer stayDays) {
        this.stayDays = stayDays;
    }

    public IssueDetailsResponse withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * **参数解释**： 租户ID。 **取值范围**： 不涉及。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public IssueDetailsResponse withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * **参数解释**： 工作项创建时间。 **取值范围**： 不涉及。
     * @return createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public IssueDetailsResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * **参数解释**： 工作项标题。 **取值范围**： 不涉及。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public IssueDetailsResponse withSecurityLevel(SecurityLevelResult securityLevel) {
        this.securityLevel = securityLevel;
        return this;
    }

    public IssueDetailsResponse withSecurityLevel(Consumer<SecurityLevelResult> securityLevelSetter) {
        if (this.securityLevel == null) {
            this.securityLevel = new SecurityLevelResult();
            securityLevelSetter.accept(this.securityLevel);
        }

        return this;
    }

    /**
     * Get securityLevel
     * @return securityLevel
     */
    public SecurityLevelResult getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(SecurityLevelResult securityLevel) {
        this.securityLevel = securityLevel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IssueDetailsResponse that = (IssueDetailsResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.number, that.number)
            && Objects.equals(this.type, that.type) && Objects.equals(this.stayDays, that.stayDays)
            && Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.createdDate, that.createdDate)
            && Objects.equals(this.title, that.title) && Objects.equals(this.securityLevel, that.securityLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, type, stayDays, tenantId, createdDate, title, securityLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueDetailsResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    stayDays: ").append(toIndentedString(stayDays)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    securityLevel: ").append(toIndentedString(securityLevel)).append("\n");
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
