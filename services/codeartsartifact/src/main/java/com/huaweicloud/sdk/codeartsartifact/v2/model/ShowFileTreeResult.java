package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowFileTreeResult
 */
public class ShowFileTreeResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uploadAccess")

    private String uploadAccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private String total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    private List<ShowFileTreeResultChildren> children = null;

    public ShowFileTreeResult withUploadAccess(String uploadAccess) {
        this.uploadAccess = uploadAccess;
        return this;
    }

    /**
     * **参数解释**: 上传权限。 **取值范围**: true：有权限。 false：无权限。 
     * @return uploadAccess
     */
    public String getUploadAccess() {
        return uploadAccess;
    }

    public void setUploadAccess(String uploadAccess) {
        this.uploadAccess = uploadAccess;
    }

    public ShowFileTreeResult withTotal(String total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**: 总数。 **取值范围**: 不涉及。 
     * @return total
     */
    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public ShowFileTreeResult withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * **参数解释**: 父路径。 **取值范围**: 不涉及。 
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public ShowFileTreeResult withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * **参数解释**: 创建时间。 **取值范围**: 不涉及。 
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ShowFileTreeResult withChildren(List<ShowFileTreeResultChildren> children) {
        this.children = children;
        return this;
    }

    public ShowFileTreeResult addChildrenItem(ShowFileTreeResultChildren childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public ShowFileTreeResult withChildren(Consumer<List<ShowFileTreeResultChildren>> childrenSetter) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * **参数解释**: 子文件及文件夹信息。 **取值范围**: 不涉及。 
     * @return children
     */
    public List<ShowFileTreeResultChildren> getChildren() {
        return children;
    }

    public void setChildren(List<ShowFileTreeResultChildren> children) {
        this.children = children;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFileTreeResult that = (ShowFileTreeResult) obj;
        return Objects.equals(this.uploadAccess, that.uploadAccess) && Objects.equals(this.total, that.total)
            && Objects.equals(this.uri, that.uri) && Objects.equals(this.created, that.created)
            && Objects.equals(this.children, that.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploadAccess, total, uri, created, children);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFileTreeResult {\n");
        sb.append("    uploadAccess: ").append(toIndentedString(uploadAccess)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
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
