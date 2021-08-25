package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.CandidateIntention;
import com.huaweicloud.sdk.cbs.v1.model.Frame;
import com.huaweicloud.sdk.cbs.v1.model.RelatedIntention;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class SkillResponse  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="skill_id")
    
    
    private String skillId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="skill_version")
    
    
    private String skillVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="frame")
    
    
    private Frame frame;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="candidate")
    
    
    private CandidateIntention candidate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="locked")
    
    
    private Boolean locked;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="related_intenions")
    
    
    private List<RelatedIntention> relatedIntenions = null;
    
    public SkillResponse withSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }

    


    /**
     * 技能ID。
     * @return skillId
     */
    public String getSkillId() {
        return skillId;
    }

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    

    public SkillResponse withSkillVersion(String skillVersion) {
        this.skillVersion = skillVersion;
        return this;
    }

    


    /**
     * 技能模型版本。
     * @return skillVersion
     */
    public String getSkillVersion() {
        return skillVersion;
    }

    public void setSkillVersion(String skillVersion) {
        this.skillVersion = skillVersion;
    }

    

    public SkillResponse withFrame(Frame frame) {
        this.frame = frame;
        return this;
    }

    public SkillResponse withFrame(Consumer<Frame> frameSetter) {
        if(this.frame == null ){
            this.frame = new Frame();
            frameSetter.accept(this.frame);
        }
        
        return this;
    }


    /**
     * Get frame
     * @return frame
     */
    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    

    public SkillResponse withCandidate(CandidateIntention candidate) {
        this.candidate = candidate;
        return this;
    }

    public SkillResponse withCandidate(Consumer<CandidateIntention> candidateSetter) {
        if(this.candidate == null ){
            this.candidate = new CandidateIntention();
            candidateSetter.accept(this.candidate);
        }
        
        return this;
    }


    /**
     * Get candidate
     * @return candidate
     */
    public CandidateIntention getCandidate() {
        return candidate;
    }

    public void setCandidate(CandidateIntention candidate) {
        this.candidate = candidate;
    }

    

    public SkillResponse withLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    


    /**
     * 技能是否锁定。
     * @return locked
     */
    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    

    public SkillResponse withRelatedIntenions(List<RelatedIntention> relatedIntenions) {
        this.relatedIntenions = relatedIntenions;
        return this;
    }

    
    public SkillResponse addRelatedIntenionsItem(RelatedIntention relatedIntenionsItem) {
        if(this.relatedIntenions == null) {
            this.relatedIntenions = new ArrayList<>();
        }
        this.relatedIntenions.add(relatedIntenionsItem);
        return this;
    }

    public SkillResponse withRelatedIntenions(Consumer<List<RelatedIntention>> relatedIntenionsSetter) {
        if(this.relatedIntenions == null) {
            this.relatedIntenions = new ArrayList<>();
        }
        relatedIntenionsSetter.accept(this.relatedIntenions);
        return this;
    }

    /**
     * 相关意图信息。
     * @return relatedIntenions
     */
    public List<RelatedIntention> getRelatedIntenions() {
        return relatedIntenions;
    }

    public void setRelatedIntenions(List<RelatedIntention> relatedIntenions) {
        this.relatedIntenions = relatedIntenions;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkillResponse skillResponse = (SkillResponse) o;
        return Objects.equals(this.skillId, skillResponse.skillId) &&
            Objects.equals(this.skillVersion, skillResponse.skillVersion) &&
            Objects.equals(this.frame, skillResponse.frame) &&
            Objects.equals(this.candidate, skillResponse.candidate) &&
            Objects.equals(this.locked, skillResponse.locked) &&
            Objects.equals(this.relatedIntenions, skillResponse.relatedIntenions);
    }
    @Override
    public int hashCode() {
        return Objects.hash(skillId, skillVersion, frame, candidate, locked, relatedIntenions);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillResponse {\n");
        sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
        sb.append("    skillVersion: ").append(toIndentedString(skillVersion)).append("\n");
        sb.append("    frame: ").append(toIndentedString(frame)).append("\n");
        sb.append("    candidate: ").append(toIndentedString(candidate)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    relatedIntenions: ").append(toIndentedString(relatedIntenions)).append("\n");
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

