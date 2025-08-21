package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 单文件下检视意见详情。
 */
public class CommentPathDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new")

    private List<LineDiscussionDto> _new = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old")

    private List<LineDiscussionDto> old = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    public CommentPathDto withNew(List<LineDiscussionDto> _new) {
        this._new = _new;
        return this;
    }

    public CommentPathDto addNewItem(LineDiscussionDto _newItem) {
        if (this._new == null) {
            this._new = new ArrayList<>();
        }
        this._new.add(_newItem);
        return this;
    }

    public CommentPathDto withNew(Consumer<List<LineDiscussionDto>> _newSetter) {
        if (this._new == null) {
            this._new = new ArrayList<>();
        }
        _newSetter.accept(this._new);
        return this;
    }

    /**
     * **参数解释：** 位于文件对比结果右侧的检视意见集合。
     * @return _new
     */
    public List<LineDiscussionDto> getNew() {
        return _new;
    }

    public void setNew(List<LineDiscussionDto> _new) {
        this._new = _new;
    }

    public CommentPathDto withOld(List<LineDiscussionDto> old) {
        this.old = old;
        return this;
    }

    public CommentPathDto addOldItem(LineDiscussionDto oldItem) {
        if (this.old == null) {
            this.old = new ArrayList<>();
        }
        this.old.add(oldItem);
        return this;
    }

    public CommentPathDto withOld(Consumer<List<LineDiscussionDto>> oldSetter) {
        if (this.old == null) {
            this.old = new ArrayList<>();
        }
        oldSetter.accept(this.old);
        return this;
    }

    /**
     * **参数解释：** 位于文件对比结果左侧的检视意见集合。
     * @return old
     */
    public List<LineDiscussionDto> getOld() {
        return old;
    }

    public void setOld(List<LineDiscussionDto> old) {
        this.old = old;
    }

    public CommentPathDto withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释：** 文件名。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommentPathDto that = (CommentPathDto) obj;
        return Objects.equals(this._new, that._new) && Objects.equals(this.old, that.old)
            && Objects.equals(this.path, that.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_new, old, path);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommentPathDto {\n");
        sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
        sb.append("    old: ").append(toIndentedString(old)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
