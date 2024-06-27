package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TestCaseCommentInfo
 */
public class TestCaseCommentInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notifier")

    private List<String> notifier = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_uri")

    private String versionUri;

    public TestCaseCommentInfo withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * 评论
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public TestCaseCommentInfo withNotifier(List<String> notifier) {
        this.notifier = notifier;
        return this;
    }

    public TestCaseCommentInfo addNotifierItem(String notifierItem) {
        if (this.notifier == null) {
            this.notifier = new ArrayList<>();
        }
        this.notifier.add(notifierItem);
        return this;
    }

    public TestCaseCommentInfo withNotifier(Consumer<List<String>> notifierSetter) {
        if (this.notifier == null) {
            this.notifier = new ArrayList<>();
        }
        notifierSetter.accept(this.notifier);
        return this;
    }

    /**
     * 通知人列表
     * @return notifier
     */
    public List<String> getNotifier() {
        return notifier;
    }

    public void setNotifier(List<String> notifier) {
        this.notifier = notifier;
    }

    public TestCaseCommentInfo withVersionUri(String versionUri) {
        this.versionUri = versionUri;
        return this;
    }

    /**
     * 分支uri/测试计划uri
     * @return versionUri
     */
    public String getVersionUri() {
        return versionUri;
    }

    public void setVersionUri(String versionUri) {
        this.versionUri = versionUri;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestCaseCommentInfo that = (TestCaseCommentInfo) obj;
        return Objects.equals(this.comment, that.comment) && Objects.equals(this.notifier, that.notifier)
            && Objects.equals(this.versionUri, that.versionUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comment, notifier, versionUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestCaseCommentInfo {\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    notifier: ").append(toIndentedString(notifier)).append("\n");
        sb.append("    versionUri: ").append(toIndentedString(versionUri)).append("\n");
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
