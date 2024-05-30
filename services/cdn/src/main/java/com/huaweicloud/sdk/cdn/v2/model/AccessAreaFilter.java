package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 区域访问控制。   &gt; - 使用该功能需要提交工单开通区域访问控制功能。   &gt; - CDN会定期更新IP地址库，部分未在地址库的IP将无法识别到所属位置。如果CDN无法识别用户所在位置，将采取放行策略，返回对应的资源给用户。
 */
public class AccessAreaFilter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_type")

    private String contentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_value")

    private String contentValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area")

    private String area;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exception_ip")

    private String exceptionIp;

    public AccessAreaFilter withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 规则类型，黑、白名单二选一。   - black: 黑名单，如果匹配到黑名单规则，则黑名单所选区域内的用户将无法访问当前资源，返回403状态码。   - white: 白名单，白名单所选区域以外的用户均无法访问当前资源，返回403状态码。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AccessAreaFilter withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * 生效类型。   - all: 所有文件，所有文件均遵循配置的规则。   - file_directory: 目录路径，指定目录路径的资源遵循配置的规则。   - file_path: 全路径，指定路径的资源遵循配置的规则。
     * @return contentType
     */
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public AccessAreaFilter withContentValue(String contentValue) {
        this.contentValue = contentValue;
        return this;
    }

    /**
     * 生效规则。当content_type为all时，为空或不传。 当content_type为file_directory时，输入要求以“/”作为首字符，多个目录以“,”进行分隔，如/test/folder01,/test/folder02，并且输入的目录路径总数不超过100个。 当content_type为file_path时，输入要求以“/”或“\\*”作为首字符，支持配置通配符“\\*”，通配符不能连续出现且不能超过两个。多个路径以“,”进行分割，如/test/a.txt,/test/b.txt，并且输出的总数不能超过100个。   > - 不允许配置两条完全一样的白名单或黑名单规则。   > - 仅允许配置一条生效类型为“所有文件”的规则。
     * @return contentValue
     */
    public String getContentValue() {
        return contentValue;
    }

    public void setContentValue(String contentValue) {
        this.contentValue = contentValue;
    }

    public AccessAreaFilter withArea(String area) {
        this.area = area;
        return this;
    }

    /**
     * 配置规则适用的区域，多个区域以“,”进行分隔，支持的区域如：CN_IN：中国大陆，AF：阿富汗，IE：爱尔兰，EG：埃及，AU：澳大利亚等。具体的位置编码参见《附录-地理位置编码》查询。
     * @return area
     */
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public AccessAreaFilter withExceptionIp(String exceptionIp) {
        this.exceptionIp = exceptionIp;
        return this;
    }

    /**
     * 例外IP，配置指定IP不执行当前规则。
     * @return exceptionIp
     */
    public String getExceptionIp() {
        return exceptionIp;
    }

    public void setExceptionIp(String exceptionIp) {
        this.exceptionIp = exceptionIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessAreaFilter that = (AccessAreaFilter) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.contentType, that.contentType)
            && Objects.equals(this.contentValue, that.contentValue) && Objects.equals(this.area, that.area)
            && Objects.equals(this.exceptionIp, that.exceptionIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, contentType, contentValue, area, exceptionIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessAreaFilter {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    contentValue: ").append(toIndentedString(contentValue)).append("\n");
        sb.append("    area: ").append(toIndentedString(area)).append("\n");
        sb.append("    exceptionIp: ").append(toIndentedString(exceptionIp)).append("\n");
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
