package com.huaweicloud.sdk.eihealth.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.eihealth.v2.model.CreateAssistantModelReq;
import com.huaweicloud.sdk.eihealth.v2.model.CreateAssistantModelRequest;
import com.huaweicloud.sdk.eihealth.v2.model.CreateAssistantModelResponse;
import com.huaweicloud.sdk.eihealth.v2.model.CreateMessageFeedbackReq;
import com.huaweicloud.sdk.eihealth.v2.model.CreateMessageFeedbackRequest;
import com.huaweicloud.sdk.eihealth.v2.model.CreateMessageFeedbackResponse;
import com.huaweicloud.sdk.eihealth.v2.model.CreateModelVendorReq;
import com.huaweicloud.sdk.eihealth.v2.model.CreateModelVendorRequest;
import com.huaweicloud.sdk.eihealth.v2.model.CreateModelVendorResponse;
import com.huaweicloud.sdk.eihealth.v2.model.DeleteAssistantModelRequest;
import com.huaweicloud.sdk.eihealth.v2.model.DeleteAssistantModelResponse;
import com.huaweicloud.sdk.eihealth.v2.model.DeleteModelVendorRequest;
import com.huaweicloud.sdk.eihealth.v2.model.DeleteModelVendorResponse;
import com.huaweicloud.sdk.eihealth.v2.model.ListAllAssistantModelsRequest;
import com.huaweicloud.sdk.eihealth.v2.model.ListAllAssistantModelsResponse;
import com.huaweicloud.sdk.eihealth.v2.model.ListAssistantModelsRequest;
import com.huaweicloud.sdk.eihealth.v2.model.ListAssistantModelsResponse;
import com.huaweicloud.sdk.eihealth.v2.model.ListModelVendorsRequest;
import com.huaweicloud.sdk.eihealth.v2.model.ListModelVendorsResponse;
import com.huaweicloud.sdk.eihealth.v2.model.ShowDrugJobStatisticsRequest;
import com.huaweicloud.sdk.eihealth.v2.model.ShowDrugJobStatisticsResponse;
import com.huaweicloud.sdk.eihealth.v2.model.UpdateAssistantModelReq;
import com.huaweicloud.sdk.eihealth.v2.model.UpdateAssistantModelRequest;
import com.huaweicloud.sdk.eihealth.v2.model.UpdateAssistantModelResponse;
import com.huaweicloud.sdk.eihealth.v2.model.UpdateModelVendorReq;
import com.huaweicloud.sdk.eihealth.v2.model.UpdateModelVendorRequest;
import com.huaweicloud.sdk.eihealth.v2.model.UpdateModelVendorResponse;

@SuppressWarnings("unchecked")
public class EiHealthMeta {

    public static final HttpRequestDef<ShowDrugJobStatisticsRequest, ShowDrugJobStatisticsResponse> showDrugJobStatistics =
        genForShowDrugJobStatistics();

    private static HttpRequestDef<ShowDrugJobStatisticsRequest, ShowDrugJobStatisticsResponse> genForShowDrugJobStatistics() {
        // basic
        HttpRequestDef.Builder<ShowDrugJobStatisticsRequest, ShowDrugJobStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDrugJobStatisticsRequest.class, ShowDrugJobStatisticsResponse.class)
            .withName("ShowDrugJobStatistics")
            .withUri("/v1/{project_id}/eihealth-projects/drug-jobs/statistics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDrugJobStatisticsRequest::getStatus, ShowDrugJobStatisticsRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMessageFeedbackRequest, CreateMessageFeedbackResponse> createMessageFeedback =
        genForCreateMessageFeedback();

    private static HttpRequestDef<CreateMessageFeedbackRequest, CreateMessageFeedbackResponse> genForCreateMessageFeedback() {
        // basic
        HttpRequestDef.Builder<CreateMessageFeedbackRequest, CreateMessageFeedbackResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateMessageFeedbackRequest.class, CreateMessageFeedbackResponse.class)
            .withName("CreateMessageFeedback")
            .withUri("/v1/{project_id}/chats/{chat_id}/messages/{message_id}/feedback")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("chat_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMessageFeedbackRequest::getChatId, CreateMessageFeedbackRequest::setChatId));
        builder.<String>withRequestField("message_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMessageFeedbackRequest::getMessageId,
                CreateMessageFeedbackRequest::setMessageId));
        builder.<CreateMessageFeedbackReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMessageFeedbackReq.class),
            f -> f.withMarshaller(CreateMessageFeedbackRequest::getBody, CreateMessageFeedbackRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAssistantModelRequest, CreateAssistantModelResponse> createAssistantModel =
        genForCreateAssistantModel();

    private static HttpRequestDef<CreateAssistantModelRequest, CreateAssistantModelResponse> genForCreateAssistantModel() {
        // basic
        HttpRequestDef.Builder<CreateAssistantModelRequest, CreateAssistantModelResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAssistantModelRequest.class, CreateAssistantModelResponse.class)
            .withName("CreateAssistantModel")
            .withUri("/v1/{project_id}/model-vendors/{vendor_id}/models")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vendor_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAssistantModelRequest::getVendorId, CreateAssistantModelRequest::setVendorId));
        builder.<CreateAssistantModelReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateAssistantModelReq.class),
            f -> f.withMarshaller(CreateAssistantModelRequest::getBody, CreateAssistantModelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAssistantModelRequest, DeleteAssistantModelResponse> deleteAssistantModel =
        genForDeleteAssistantModel();

    private static HttpRequestDef<DeleteAssistantModelRequest, DeleteAssistantModelResponse> genForDeleteAssistantModel() {
        // basic
        HttpRequestDef.Builder<DeleteAssistantModelRequest, DeleteAssistantModelResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAssistantModelRequest.class, DeleteAssistantModelResponse.class)
            .withName("DeleteAssistantModel")
            .withUri("/v1/{project_id}/model-vendors/{vendor_id}/models/{model_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vendor_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssistantModelRequest::getVendorId, DeleteAssistantModelRequest::setVendorId));
        builder.<String>withRequestField("model_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssistantModelRequest::getModelId, DeleteAssistantModelRequest::setModelId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllAssistantModelsRequest, ListAllAssistantModelsResponse> listAllAssistantModels =
        genForListAllAssistantModels();

    private static HttpRequestDef<ListAllAssistantModelsRequest, ListAllAssistantModelsResponse> genForListAllAssistantModels() {
        // basic
        HttpRequestDef.Builder<ListAllAssistantModelsRequest, ListAllAssistantModelsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAllAssistantModelsRequest.class, ListAllAssistantModelsResponse.class)
            .withName("ListAllAssistantModels")
            .withUri("/v1/{project_id}/assistant-models")
            .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("chain_of_thought",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAllAssistantModelsRequest::getChainOfThought,
                ListAllAssistantModelsRequest::setChainOfThought));
        builder.<Boolean>withRequestField("function_of_call",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAllAssistantModelsRequest::getFunctionOfCall,
                ListAllAssistantModelsRequest::setFunctionOfCall));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllAssistantModelsRequest::getStatus, ListAllAssistantModelsRequest::setStatus));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllAssistantModelsRequest::getType, ListAllAssistantModelsRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAssistantModelsRequest, ListAssistantModelsResponse> listAssistantModels =
        genForListAssistantModels();

    private static HttpRequestDef<ListAssistantModelsRequest, ListAssistantModelsResponse> genForListAssistantModels() {
        // basic
        HttpRequestDef.Builder<ListAssistantModelsRequest, ListAssistantModelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAssistantModelsRequest.class, ListAssistantModelsResponse.class)
                .withName("ListAssistantModels")
                .withUri("/v1/{project_id}/model-vendors/{vendor_id}/models")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vendor_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssistantModelsRequest::getVendorId, ListAssistantModelsRequest::setVendorId));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssistantModelsRequest::getSortKey, ListAssistantModelsRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssistantModelsRequest::getSortDir, ListAssistantModelsRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAssistantModelRequest, UpdateAssistantModelResponse> updateAssistantModel =
        genForUpdateAssistantModel();

    private static HttpRequestDef<UpdateAssistantModelRequest, UpdateAssistantModelResponse> genForUpdateAssistantModel() {
        // basic
        HttpRequestDef.Builder<UpdateAssistantModelRequest, UpdateAssistantModelResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAssistantModelRequest.class, UpdateAssistantModelResponse.class)
            .withName("UpdateAssistantModel")
            .withUri("/v1/{project_id}/model-vendors/{vendor_id}/models/{model_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vendor_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAssistantModelRequest::getVendorId, UpdateAssistantModelRequest::setVendorId));
        builder.<String>withRequestField("model_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAssistantModelRequest::getModelId, UpdateAssistantModelRequest::setModelId));
        builder.<UpdateAssistantModelReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateAssistantModelReq.class),
            f -> f.withMarshaller(UpdateAssistantModelRequest::getBody, UpdateAssistantModelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateModelVendorRequest, CreateModelVendorResponse> createModelVendor =
        genForCreateModelVendor();

    private static HttpRequestDef<CreateModelVendorRequest, CreateModelVendorResponse> genForCreateModelVendor() {
        // basic
        HttpRequestDef.Builder<CreateModelVendorRequest, CreateModelVendorResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateModelVendorRequest.class, CreateModelVendorResponse.class)
                .withName("CreateModelVendor")
                .withUri("/v1/{project_id}/model-vendors")
                .withContentType("application/json");

        // requests
        builder.<CreateModelVendorReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateModelVendorReq.class),
            f -> f.withMarshaller(CreateModelVendorRequest::getBody, CreateModelVendorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteModelVendorRequest, DeleteModelVendorResponse> deleteModelVendor =
        genForDeleteModelVendor();

    private static HttpRequestDef<DeleteModelVendorRequest, DeleteModelVendorResponse> genForDeleteModelVendor() {
        // basic
        HttpRequestDef.Builder<DeleteModelVendorRequest, DeleteModelVendorResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteModelVendorRequest.class, DeleteModelVendorResponse.class)
                .withName("DeleteModelVendor")
                .withUri("/v1/{project_id}/model-vendors/{vendor_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vendor_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteModelVendorRequest::getVendorId, DeleteModelVendorRequest::setVendorId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListModelVendorsRequest, ListModelVendorsResponse> listModelVendors =
        genForListModelVendors();

    private static HttpRequestDef<ListModelVendorsRequest, ListModelVendorsResponse> genForListModelVendors() {
        // basic
        HttpRequestDef.Builder<ListModelVendorsRequest, ListModelVendorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListModelVendorsRequest.class, ListModelVendorsResponse.class)
                .withName("ListModelVendors")
                .withUri("/v1/{project_id}/model-vendors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModelVendorsRequest::getType, ListModelVendorsRequest::setType));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModelVendorsRequest::getSortKey, ListModelVendorsRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModelVendorsRequest::getSortDir, ListModelVendorsRequest::setSortDir));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListModelVendorsRequest::getLimit, ListModelVendorsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListModelVendorsRequest::getOffset, ListModelVendorsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateModelVendorRequest, UpdateModelVendorResponse> updateModelVendor =
        genForUpdateModelVendor();

    private static HttpRequestDef<UpdateModelVendorRequest, UpdateModelVendorResponse> genForUpdateModelVendor() {
        // basic
        HttpRequestDef.Builder<UpdateModelVendorRequest, UpdateModelVendorResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateModelVendorRequest.class, UpdateModelVendorResponse.class)
                .withName("UpdateModelVendor")
                .withUri("/v1/{project_id}/model-vendors/{vendor_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vendor_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateModelVendorRequest::getVendorId, UpdateModelVendorRequest::setVendorId));
        builder.<UpdateModelVendorReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateModelVendorReq.class),
            f -> f.withMarshaller(UpdateModelVendorRequest::getBody, UpdateModelVendorRequest::setBody));

        // response

        return builder.build();
    }

}
