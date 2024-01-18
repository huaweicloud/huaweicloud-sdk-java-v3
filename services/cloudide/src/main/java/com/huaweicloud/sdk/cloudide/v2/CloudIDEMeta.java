package com.huaweicloud.sdk.cloudide.v2;

import com.huaweicloud.sdk.cloudide.v2.model.AcceptanceSchema;
import com.huaweicloud.sdk.cloudide.v2.model.AddExtensionEvaluationReplyRequest;
import com.huaweicloud.sdk.cloudide.v2.model.AddExtensionEvaluationReplyResponse;
import com.huaweicloud.sdk.cloudide.v2.model.AddExtensionEvaluationRequest;
import com.huaweicloud.sdk.cloudide.v2.model.AddExtensionEvaluationResponse;
import com.huaweicloud.sdk.cloudide.v2.model.AddExtensionStarRequest;
import com.huaweicloud.sdk.cloudide.v2.model.AddExtensionStarResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ChatRequestMessage;
import com.huaweicloud.sdk.cloudide.v2.model.ChatResultRequestMessage;
import com.huaweicloud.sdk.cloudide.v2.model.CheckInstanceAccessRequest;
import com.huaweicloud.sdk.cloudide.v2.model.CheckInstanceAccessResponse;
import com.huaweicloud.sdk.cloudide.v2.model.CheckMaliciousExtensionEvaluationRequest;
import com.huaweicloud.sdk.cloudide.v2.model.CheckMaliciousExtensionEvaluationResponse;
import com.huaweicloud.sdk.cloudide.v2.model.CheckNameRequest;
import com.huaweicloud.sdk.cloudide.v2.model.CheckNameResponse;
import com.huaweicloud.sdk.cloudide.v2.model.CreateAcceptanceRequest;
import com.huaweicloud.sdk.cloudide.v2.model.CreateAcceptanceResponse;
import com.huaweicloud.sdk.cloudide.v2.model.CreateApplyRequest;
import com.huaweicloud.sdk.cloudide.v2.model.CreateApplyResponse;
import com.huaweicloud.sdk.cloudide.v2.model.CreateEventRequest;
import com.huaweicloud.sdk.cloudide.v2.model.CreateEventResponse;
import com.huaweicloud.sdk.cloudide.v2.model.CreateExtensionAuthorizationRequest;
import com.huaweicloud.sdk.cloudide.v2.model.CreateExtensionAuthorizationResponse;
import com.huaweicloud.sdk.cloudide.v2.model.CreateInstanceBy3rdRequest;
import com.huaweicloud.sdk.cloudide.v2.model.CreateInstanceBy3rdResponse;
import com.huaweicloud.sdk.cloudide.v2.model.CreateInstanceRequest;
import com.huaweicloud.sdk.cloudide.v2.model.CreateInstanceResponse;
import com.huaweicloud.sdk.cloudide.v2.model.CreateLoginRequest;
import com.huaweicloud.sdk.cloudide.v2.model.CreateLoginResponse;
import com.huaweicloud.sdk.cloudide.v2.model.CreateRequestRequest;
import com.huaweicloud.sdk.cloudide.v2.model.CreateRequestResponse;
import com.huaweicloud.sdk.cloudide.v2.model.DeleteEvaluationReplyRequest;
import com.huaweicloud.sdk.cloudide.v2.model.DeleteEvaluationReplyResponse;
import com.huaweicloud.sdk.cloudide.v2.model.DeleteEvaluationRequest;
import com.huaweicloud.sdk.cloudide.v2.model.DeleteEvaluationResponse;
import com.huaweicloud.sdk.cloudide.v2.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.cloudide.v2.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.cloudide.v2.model.Evaluation;
import com.huaweicloud.sdk.cloudide.v2.model.EvaluationAccusation;
import com.huaweicloud.sdk.cloudide.v2.model.EvaluationReply;
import com.huaweicloud.sdk.cloudide.v2.model.EventSchema;
import com.huaweicloud.sdk.cloudide.v2.model.ExtensionAuthorization;
import com.huaweicloud.sdk.cloudide.v2.model.ExtensionQueryParamSnake;
import com.huaweicloud.sdk.cloudide.v2.model.ExtensionSearchUserInputParamCustomizeForDetail;
import com.huaweicloud.sdk.cloudide.v2.model.ExtensionStar;
import com.huaweicloud.sdk.cloudide.v2.model.InstanceEdgeParam;
import com.huaweicloud.sdk.cloudide.v2.model.InstanceParam;
import com.huaweicloud.sdk.cloudide.v2.model.InstanceUpdateParam;
import com.huaweicloud.sdk.cloudide.v2.model.JoinRequestSchema;
import com.huaweicloud.sdk.cloudide.v2.model.ListExtensionsRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ListExtensionsResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ListInstancesRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ListInstancesResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ListOrgInstancesRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ListOrgInstancesResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ListProjectTemplatesRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ListProjectTemplatesResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ListPublisherRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ListPublisherResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ListStacksRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ListStacksResponse;
import com.huaweicloud.sdk.cloudide.v2.model.LoginSchema;
import com.huaweicloud.sdk.cloudide.v2.model.PropertiesSchema;
import com.huaweicloud.sdk.cloudide.v2.model.PublishExtensionRequest;
import com.huaweicloud.sdk.cloudide.v2.model.PublishExtensionResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ShowAccountStatusRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ShowAccountStatusResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ShowCategoryListRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ShowCategoryListResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ShowExtensionAuthorizationRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ShowExtensionAuthorizationResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ShowExtensionDetailRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ShowExtensionDetailResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ShowExtensionEvaluationRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ShowExtensionEvaluationResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ShowExtensionEvaluationStarRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ShowExtensionEvaluationStarResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ShowExtensionTestingResultRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ShowExtensionTestingResultResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ShowInstanceRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ShowInstanceResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ShowInstanceStatusInfoRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ShowInstanceStatusInfoResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ShowPriceRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ShowPriceResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ShowResultRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ShowResultResponse;
import com.huaweicloud.sdk.cloudide.v2.model.StartChatRequest;
import com.huaweicloud.sdk.cloudide.v2.model.StartChatRequestMessage;
import com.huaweicloud.sdk.cloudide.v2.model.StartChatResponse;
import com.huaweicloud.sdk.cloudide.v2.model.StartInstanceParam;
import com.huaweicloud.sdk.cloudide.v2.model.StartInstanceRequest;
import com.huaweicloud.sdk.cloudide.v2.model.StartInstanceResponse;
import com.huaweicloud.sdk.cloudide.v2.model.StopInstanceRequest;
import com.huaweicloud.sdk.cloudide.v2.model.StopInstanceResponse;
import com.huaweicloud.sdk.cloudide.v2.model.SyncChatRequest;
import com.huaweicloud.sdk.cloudide.v2.model.SyncChatResponse;
import com.huaweicloud.sdk.cloudide.v2.model.SyncGetChatResultRequest;
import com.huaweicloud.sdk.cloudide.v2.model.SyncGetChatResultResponse;
import com.huaweicloud.sdk.cloudide.v2.model.TaskModelMarketPlace;
import com.huaweicloud.sdk.cloudide.v2.model.UpdateInstanceActivityRequest;
import com.huaweicloud.sdk.cloudide.v2.model.UpdateInstanceActivityResponse;
import com.huaweicloud.sdk.cloudide.v2.model.UpdateInstanceRequest;
import com.huaweicloud.sdk.cloudide.v2.model.UpdateInstanceResponse;
import com.huaweicloud.sdk.cloudide.v2.model.UploadExtensionFileRequest;
import com.huaweicloud.sdk.cloudide.v2.model.UploadExtensionFileRequestBody;
import com.huaweicloud.sdk.cloudide.v2.model.UploadExtensionFileResponse;
import com.huaweicloud.sdk.cloudide.v2.model.UploadFilePublisherRequest;
import com.huaweicloud.sdk.cloudide.v2.model.UploadFilePublisherRequestBody;
import com.huaweicloud.sdk.cloudide.v2.model.UploadFilePublisherResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CloudIDEMeta {

    public static final HttpRequestDef<AddExtensionEvaluationRequest, AddExtensionEvaluationResponse> addExtensionEvaluation =
        genForAddExtensionEvaluation();

    private static HttpRequestDef<AddExtensionEvaluationRequest, AddExtensionEvaluationResponse> genForAddExtensionEvaluation() {
        // basic
        HttpRequestDef.Builder<AddExtensionEvaluationRequest, AddExtensionEvaluationResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddExtensionEvaluationRequest.class, AddExtensionEvaluationResponse.class)
            .withName("AddExtensionEvaluation")
            .withUri("/v1/marketplace/extension/evaluation")
            .withContentType("application/json");

        // requests
        builder.<Evaluation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Evaluation.class),
            f -> f.withMarshaller(AddExtensionEvaluationRequest::getBody, AddExtensionEvaluationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddExtensionEvaluationReplyRequest, AddExtensionEvaluationReplyResponse> addExtensionEvaluationReply =
        genForAddExtensionEvaluationReply();

    private static HttpRequestDef<AddExtensionEvaluationReplyRequest, AddExtensionEvaluationReplyResponse> genForAddExtensionEvaluationReply() {
        // basic
        HttpRequestDef.Builder<AddExtensionEvaluationReplyRequest, AddExtensionEvaluationReplyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AddExtensionEvaluationReplyRequest.class,
                    AddExtensionEvaluationReplyResponse.class)
                .withName("AddExtensionEvaluationReply")
                .withUri("/v1/marketplace/extension/evaluation/reply")
                .withContentType("application/json");

        // requests
        builder.<EvaluationReply>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EvaluationReply.class),
            f -> f.withMarshaller(AddExtensionEvaluationReplyRequest::getBody,
                AddExtensionEvaluationReplyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddExtensionStarRequest, AddExtensionStarResponse> addExtensionStar =
        genForAddExtensionStar();

    private static HttpRequestDef<AddExtensionStarRequest, AddExtensionStarResponse> genForAddExtensionStar() {
        // basic
        HttpRequestDef.Builder<AddExtensionStarRequest, AddExtensionStarResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddExtensionStarRequest.class, AddExtensionStarResponse.class)
                .withName("AddExtensionStar")
                .withUri("/v1/marketplace/star")
                .withContentType("application/json");

        // requests
        builder.<ExtensionStar>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExtensionStar.class),
            f -> f.withMarshaller(AddExtensionStarRequest::getBody, AddExtensionStarRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckMaliciousExtensionEvaluationRequest, CheckMaliciousExtensionEvaluationResponse> checkMaliciousExtensionEvaluation =
        genForCheckMaliciousExtensionEvaluation();

    private static HttpRequestDef<CheckMaliciousExtensionEvaluationRequest, CheckMaliciousExtensionEvaluationResponse> genForCheckMaliciousExtensionEvaluation() {
        // basic
        HttpRequestDef.Builder<CheckMaliciousExtensionEvaluationRequest, CheckMaliciousExtensionEvaluationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CheckMaliciousExtensionEvaluationRequest.class,
                    CheckMaliciousExtensionEvaluationResponse.class)
                .withName("CheckMaliciousExtensionEvaluation")
                .withUri("/v1/marketplace/extension/evaluation/accusation")
                .withContentType("application/json");

        // requests
        builder.<EvaluationAccusation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EvaluationAccusation.class),
            f -> f.withMarshaller(CheckMaliciousExtensionEvaluationRequest::getBody,
                CheckMaliciousExtensionEvaluationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateExtensionAuthorizationRequest, CreateExtensionAuthorizationResponse> createExtensionAuthorization =
        genForCreateExtensionAuthorization();

    private static HttpRequestDef<CreateExtensionAuthorizationRequest, CreateExtensionAuthorizationResponse> genForCreateExtensionAuthorization() {
        // basic
        HttpRequestDef.Builder<CreateExtensionAuthorizationRequest, CreateExtensionAuthorizationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateExtensionAuthorizationRequest.class,
                    CreateExtensionAuthorizationResponse.class)
                .withName("CreateExtensionAuthorization")
                .withUri("/v2/extension/authorization/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateExtensionAuthorizationRequest::getInstanceId,
                CreateExtensionAuthorizationRequest::setInstanceId));
        builder.<ExtensionAuthorization>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExtensionAuthorization.class),
            f -> f.withMarshaller(CreateExtensionAuthorizationRequest::getBody,
                CreateExtensionAuthorizationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEvaluationRequest, DeleteEvaluationResponse> deleteEvaluation =
        genForDeleteEvaluation();

    private static HttpRequestDef<DeleteEvaluationRequest, DeleteEvaluationResponse> genForDeleteEvaluation() {
        // basic
        HttpRequestDef.Builder<DeleteEvaluationRequest, DeleteEvaluationResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEvaluationRequest.class, DeleteEvaluationResponse.class)
                .withName("DeleteEvaluation")
                .withUri("/v1/marketplace/evaluation/{evaluation_id}")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("evaluation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DeleteEvaluationRequest::getEvaluationId, DeleteEvaluationRequest::setEvaluationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEvaluationReplyRequest, DeleteEvaluationReplyResponse> deleteEvaluationReply =
        genForDeleteEvaluationReply();

    private static HttpRequestDef<DeleteEvaluationReplyRequest, DeleteEvaluationReplyResponse> genForDeleteEvaluationReply() {
        // basic
        HttpRequestDef.Builder<DeleteEvaluationReplyRequest, DeleteEvaluationReplyResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteEvaluationReplyRequest.class, DeleteEvaluationReplyResponse.class)
            .withName("DeleteEvaluationReply")
            .withUri("/v1/marketplace/evaluation/reply/{reply_id}")
            .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("reply_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DeleteEvaluationReplyRequest::getReplyId, DeleteEvaluationReplyRequest::setReplyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListExtensionsRequest, ListExtensionsResponse> listExtensions =
        genForListExtensions();

    private static HttpRequestDef<ListExtensionsRequest, ListExtensionsResponse> genForListExtensions() {
        // basic
        HttpRequestDef.Builder<ListExtensionsRequest, ListExtensionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListExtensionsRequest.class, ListExtensionsResponse.class)
                .withName("ListExtensions")
                .withUri("/v1/marketplace/extension/extensionquery")
                .withContentType("application/json");

        // requests
        builder.<ExtensionQueryParamSnake>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExtensionQueryParamSnake.class),
            f -> f.withMarshaller(ListExtensionsRequest::getBody, ListExtensionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectTemplatesRequest, ListProjectTemplatesResponse> listProjectTemplates =
        genForListProjectTemplates();

    private static HttpRequestDef<ListProjectTemplatesRequest, ListProjectTemplatesResponse> genForListProjectTemplates() {
        // basic
        HttpRequestDef.Builder<ListProjectTemplatesRequest, ListProjectTemplatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProjectTemplatesRequest.class, ListProjectTemplatesResponse.class)
            .withName("ListProjectTemplates")
            .withUri("/v2/templates")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("arch",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectTemplatesRequest::getArch, ListProjectTemplatesRequest::setArch));
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectTemplatesRequest::getStackId, ListProjectTemplatesRequest::setStackId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublisherRequest, ListPublisherResponse> listPublisher =
        genForListPublisher();

    private static HttpRequestDef<ListPublisherRequest, ListPublisherResponse> genForListPublisher() {
        // basic
        HttpRequestDef.Builder<ListPublisherRequest, ListPublisherResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPublisherRequest.class, ListPublisherResponse.class)
                .withName("ListPublisher")
                .withUri("/v1/marketplace/publishers/mine")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublisherRequest::getName, ListPublisherRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStacksRequest, ListStacksResponse> listStacks = genForListStacks();

    private static HttpRequestDef<ListStacksRequest, ListStacksResponse> genForListStacks() {
        // basic
        HttpRequestDef.Builder<ListStacksRequest, ListStacksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStacksRequest.class, ListStacksResponse.class)
                .withName("ListStacks")
                .withUri("/v2/stacks/tag")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStacksRequest::getTags, ListStacksRequest::setTags));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishExtensionRequest, PublishExtensionResponse> publishExtension =
        genForPublishExtension();

    private static HttpRequestDef<PublishExtensionRequest, PublishExtensionResponse> genForPublishExtension() {
        // basic
        HttpRequestDef.Builder<PublishExtensionRequest, PublishExtensionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PublishExtensionRequest.class, PublishExtensionResponse.class)
                .withName("PublishExtension")
                .withUri("/v1/marketplace/extension/{task_id}/archiving")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishExtensionRequest::getTaskId, PublishExtensionRequest::setTaskId));
        builder.<String>withRequestField("x-publisher-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishExtensionRequest::getXPublisherToken,
                PublishExtensionRequest::setXPublisherToken));
        builder.<TaskModelMarketPlace>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TaskModelMarketPlace.class),
            f -> f.withMarshaller(PublishExtensionRequest::getBody, PublishExtensionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAccountStatusRequest, ShowAccountStatusResponse> showAccountStatus =
        genForShowAccountStatus();

    private static HttpRequestDef<ShowAccountStatusRequest, ShowAccountStatusResponse> genForShowAccountStatus() {
        // basic
        HttpRequestDef.Builder<ShowAccountStatusRequest, ShowAccountStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAccountStatusRequest.class, ShowAccountStatusResponse.class)
                .withName("ShowAccountStatus")
                .withUri("/v2/permission/account/status")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCategoryListRequest, ShowCategoryListResponse> showCategoryList =
        genForShowCategoryList();

    private static HttpRequestDef<ShowCategoryListRequest, ShowCategoryListResponse> genForShowCategoryList() {
        // basic
        HttpRequestDef.Builder<ShowCategoryListRequest, ShowCategoryListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCategoryListRequest.class, ShowCategoryListResponse.class)
                .withName("ShowCategoryList")
                .withUri("/v1/marketplace/extension/category")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("page_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowCategoryListRequest::getPageNum, ShowCategoryListRequest::setPageNum));
        builder.<Long>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowCategoryListRequest::getPageSize, ShowCategoryListRequest::setPageSize));
        builder.<String>withRequestField("scene_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCategoryListRequest::getSceneName, ShowCategoryListRequest::setSceneName));
        builder.<Integer>withRequestField("support_ide",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCategoryListRequest::getSupportIde, ShowCategoryListRequest::setSupportIde));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCategoryListRequest::getType, ShowCategoryListRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowExtensionAuthorizationRequest, ShowExtensionAuthorizationResponse> showExtensionAuthorization =
        genForShowExtensionAuthorization();

    private static HttpRequestDef<ShowExtensionAuthorizationRequest, ShowExtensionAuthorizationResponse> genForShowExtensionAuthorization() {
        // basic
        HttpRequestDef.Builder<ShowExtensionAuthorizationRequest, ShowExtensionAuthorizationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowExtensionAuthorizationRequest.class,
                    ShowExtensionAuthorizationResponse.class)
                .withName("ShowExtensionAuthorization")
                .withUri("/v2/extension/authorization")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("extension_version",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExtensionAuthorizationRequest::getExtensionVersion,
                ShowExtensionAuthorizationRequest::setExtensionVersion));
        builder.<String>withRequestField("identifier",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExtensionAuthorizationRequest::getIdentifier,
                ShowExtensionAuthorizationRequest::setIdentifier));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExtensionAuthorizationRequest::getInstanceId,
                ShowExtensionAuthorizationRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowExtensionDetailRequest, ShowExtensionDetailResponse> showExtensionDetail =
        genForShowExtensionDetail();

    private static HttpRequestDef<ShowExtensionDetailRequest, ShowExtensionDetailResponse> genForShowExtensionDetail() {
        // basic
        HttpRequestDef.Builder<ShowExtensionDetailRequest, ShowExtensionDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowExtensionDetailRequest.class, ShowExtensionDetailResponse.class)
                .withName("ShowExtensionDetail")
                .withUri("/v1/marketplace/extension/public/detail")
                .withContentType("application/json");

        // requests
        builder.<ExtensionSearchUserInputParamCustomizeForDetail>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExtensionSearchUserInputParamCustomizeForDetail.class),
            f -> f.withMarshaller(ShowExtensionDetailRequest::getBody, ShowExtensionDetailRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowExtensionEvaluationRequest, ShowExtensionEvaluationResponse> showExtensionEvaluation =
        genForShowExtensionEvaluation();

    private static HttpRequestDef<ShowExtensionEvaluationRequest, ShowExtensionEvaluationResponse> genForShowExtensionEvaluation() {
        // basic
        HttpRequestDef.Builder<ShowExtensionEvaluationRequest, ShowExtensionEvaluationResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowExtensionEvaluationRequest.class, ShowExtensionEvaluationResponse.class)
            .withName("ShowExtensionEvaluation")
            .withUri("/v1/marketplace/feedback/evaluation")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("extension_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExtensionEvaluationRequest::getExtensionId,
                ShowExtensionEvaluationRequest::setExtensionId));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowExtensionEvaluationRequest::getLimit, ShowExtensionEvaluationRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowExtensionEvaluationRequest::getOffset,
                ShowExtensionEvaluationRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowExtensionEvaluationStarRequest, ShowExtensionEvaluationStarResponse> showExtensionEvaluationStar =
        genForShowExtensionEvaluationStar();

    private static HttpRequestDef<ShowExtensionEvaluationStarRequest, ShowExtensionEvaluationStarResponse> genForShowExtensionEvaluationStar() {
        // basic
        HttpRequestDef.Builder<ShowExtensionEvaluationStarRequest, ShowExtensionEvaluationStarResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowExtensionEvaluationStarRequest.class,
                    ShowExtensionEvaluationStarResponse.class)
                .withName("ShowExtensionEvaluationStar")
                .withUri("/v1/marketplace/feedback/star")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("extension_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExtensionEvaluationStarRequest::getExtensionId,
                ShowExtensionEvaluationStarRequest::setExtensionId));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowExtensionEvaluationStarRequest::getLimit,
                ShowExtensionEvaluationStarRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowExtensionEvaluationStarRequest::getOffset,
                ShowExtensionEvaluationStarRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowExtensionTestingResultRequest, ShowExtensionTestingResultResponse> showExtensionTestingResult =
        genForShowExtensionTestingResult();

    private static HttpRequestDef<ShowExtensionTestingResultRequest, ShowExtensionTestingResultResponse> genForShowExtensionTestingResult() {
        // basic
        HttpRequestDef.Builder<ShowExtensionTestingResultRequest, ShowExtensionTestingResultResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowExtensionTestingResultRequest.class,
                    ShowExtensionTestingResultResponse.class)
                .withName("ShowExtensionTestingResult")
                .withUri("/v1/marketplace/extension/{task_id}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExtensionTestingResultRequest::getTaskId,
                ShowExtensionTestingResultRequest::setTaskId));
        builder.<String>withRequestField("x-publisher-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExtensionTestingResultRequest::getXPublisherToken,
                ShowExtensionTestingResultRequest::setXPublisherToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPriceRequest, ShowPriceResponse> showPrice = genForShowPrice();

    private static HttpRequestDef<ShowPriceRequest, ShowPriceResponse> genForShowPrice() {
        // basic
        HttpRequestDef.Builder<ShowPriceRequest, ShowPriceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPriceRequest.class, ShowPriceResponse.class)
                .withName("ShowPrice")
                .withUri("/v2/stacks/price")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadExtensionFileRequest, UploadExtensionFileResponse> uploadExtensionFile =
        genForUploadExtensionFile();

    private static HttpRequestDef<UploadExtensionFileRequest, UploadExtensionFileResponse> genForUploadExtensionFile() {
        // basic
        HttpRequestDef.Builder<UploadExtensionFileRequest, UploadExtensionFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadExtensionFileRequest.class, UploadExtensionFileResponse.class)
                .withName("UploadExtensionFile")
                .withUri("/v1/marketplace/file/plugin")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("official",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadExtensionFileRequest::getOfficial, UploadExtensionFileRequest::setOfficial));
        builder.<UploadExtensionFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadExtensionFileRequestBody.class),
            f -> f.withMarshaller(UploadExtensionFileRequest::getBody, UploadExtensionFileRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadFilePublisherRequest, UploadFilePublisherResponse> uploadFilePublisher =
        genForUploadFilePublisher();

    private static HttpRequestDef<UploadFilePublisherRequest, UploadFilePublisherResponse> genForUploadFilePublisher() {
        // basic
        HttpRequestDef.Builder<UploadFilePublisherRequest, UploadFilePublisherResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadFilePublisherRequest.class, UploadFilePublisherResponse.class)
                .withName("UploadFilePublisher")
                .withUri("/v2/fileservice/file/upload")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("x-publisher-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadFilePublisherRequest::getXPublisherToken,
                UploadFilePublisherRequest::setXPublisherToken));
        builder.<UploadFilePublisherRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadFilePublisherRequestBody.class),
            f -> f.withMarshaller(UploadFilePublisherRequest::getBody, UploadFilePublisherRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAcceptanceRequest, CreateAcceptanceResponse> createAcceptance =
        genForCreateAcceptance();

    private static HttpRequestDef<CreateAcceptanceRequest, CreateAcceptanceResponse> genForCreateAcceptance() {
        // basic
        HttpRequestDef.Builder<CreateAcceptanceRequest, CreateAcceptanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAcceptanceRequest.class, CreateAcceptanceResponse.class)
                .withName("CreateAcceptance")
                .withUri("/v2/aims/codemodelserver/code-generation/acceptance")
                .withContentType("application/json");

        // requests
        builder.<AcceptanceSchema>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AcceptanceSchema.class),
            f -> f.withMarshaller(CreateAcceptanceRequest::getBody, CreateAcceptanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateApplyRequest, CreateApplyResponse> createApply = genForCreateApply();

    private static HttpRequestDef<CreateApplyRequest, CreateApplyResponse> genForCreateApply() {
        // basic
        HttpRequestDef.Builder<CreateApplyRequest, CreateApplyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateApplyRequest.class, CreateApplyResponse.class)
                .withName("CreateApply")
                .withUri("/v2/aims/codemodelserver/join-request")
                .withContentType("application/json");

        // requests
        builder.<JoinRequestSchema>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JoinRequestSchema.class),
            f -> f.withMarshaller(CreateApplyRequest::getBody, CreateApplyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEventRequest, CreateEventResponse> createEvent = genForCreateEvent();

    private static HttpRequestDef<CreateEventRequest, CreateEventResponse> genForCreateEvent() {
        // basic
        HttpRequestDef.Builder<CreateEventRequest, CreateEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEventRequest.class, CreateEventResponse.class)
                .withName("CreateEvent")
                .withUri("/v2/aims/codemodelserver/management/event")
                .withContentType("application/json");

        // requests
        builder.<EventSchema>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EventSchema.class),
            f -> f.withMarshaller(CreateEventRequest::getBody, CreateEventRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLoginRequest, CreateLoginResponse> createLogin = genForCreateLogin();

    private static HttpRequestDef<CreateLoginRequest, CreateLoginResponse> genForCreateLogin() {
        // basic
        HttpRequestDef.Builder<CreateLoginRequest, CreateLoginResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLoginRequest.class, CreateLoginResponse.class)
                .withName("CreateLogin")
                .withUri("/v2/aims/codemodelserver/code-generation/login")
                .withContentType("application/json");

        // requests
        builder.<LoginSchema>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LoginSchema.class),
            f -> f.withMarshaller(CreateLoginRequest::getBody, CreateLoginRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRequestRequest, CreateRequestResponse> createRequest =
        genForCreateRequest();

    private static HttpRequestDef<CreateRequestRequest, CreateRequestResponse> genForCreateRequest() {
        // basic
        HttpRequestDef.Builder<CreateRequestRequest, CreateRequestResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRequestRequest.class, CreateRequestResponse.class)
                .withName("CreateRequest")
                .withUri("/v2/aims/codemodelserver/code-generation/request")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("topn",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateRequestRequest::getTopn, CreateRequestRequest::setTopn));
        builder.<String>withRequestField("scenario",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRequestRequest::getScenario, CreateRequestRequest::setScenario));
        builder.<Boolean>withRequestField("resubmit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(CreateRequestRequest::getResubmit, CreateRequestRequest::setResubmit));
        builder.<String>withRequestField("model_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRequestRequest::getModelId, CreateRequestRequest::setModelId));
        builder.<CreateRequestRequest.RequestTypeEnum>withRequestField("request_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateRequestRequest.RequestTypeEnum.class),
            f -> f.withMarshaller(CreateRequestRequest::getRequestType, CreateRequestRequest::setRequestType));
        builder.<PropertiesSchema>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PropertiesSchema.class),
            f -> f.withMarshaller(CreateRequestRequest::getBody, CreateRequestRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResultRequest, ShowResultResponse> showResult = genForShowResult();

    private static HttpRequestDef<ShowResultRequest, ShowResultResponse> genForShowResult() {
        // basic
        HttpRequestDef.Builder<ShowResultRequest, ShowResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResultRequest.class, ShowResultResponse.class)
                .withName("ShowResult")
                .withUri("/v2/aims/codemodelserver/code-generation/results")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("request_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResultRequest::getRequestId, ShowResultRequest::setRequestId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartChatRequest, StartChatResponse> startChat = genForStartChat();

    private static HttpRequestDef<StartChatRequest, StartChatResponse> genForStartChat() {
        // basic
        HttpRequestDef.Builder<StartChatRequest, StartChatResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartChatRequest.class, StartChatResponse.class)
                .withName("StartChat")
                .withUri("/v1/codebreezetsbot/devmind/tsbot/start-chat")
                .withContentType("application/json");

        // requests
        builder.<StartChatRequestMessage>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartChatRequestMessage.class),
            f -> f.withMarshaller(StartChatRequest::getBody, StartChatRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SyncChatRequest, SyncChatResponse> syncChat = genForSyncChat();

    private static HttpRequestDef<SyncChatRequest, SyncChatResponse> genForSyncChat() {
        // basic
        HttpRequestDef.Builder<SyncChatRequest, SyncChatResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SyncChatRequest.class, SyncChatResponse.class)
                .withName("SyncChat")
                .withUri("/v1/codebreezetsbot/devmind/tsbot/async-chat")
                .withContentType("application/json");

        // requests
        builder.<ChatRequestMessage>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChatRequestMessage.class),
            f -> f.withMarshaller(SyncChatRequest::getBody, SyncChatRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SyncGetChatResultRequest, SyncGetChatResultResponse> syncGetChatResult =
        genForSyncGetChatResult();

    private static HttpRequestDef<SyncGetChatResultRequest, SyncGetChatResultResponse> genForSyncGetChatResult() {
        // basic
        HttpRequestDef.Builder<SyncGetChatResultRequest, SyncGetChatResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SyncGetChatResultRequest.class, SyncGetChatResultResponse.class)
                .withName("SyncGetChatResult")
                .withUri("/v1/codebreezetsbot/devmind/tsbot/async-get-chat-result")
                .withContentType("application/json");

        // requests
        builder.<ChatResultRequestMessage>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChatResultRequestMessage.class),
            f -> f.withMarshaller(SyncGetChatResultRequest::getBody, SyncGetChatResultRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckInstanceAccessRequest, CheckInstanceAccessResponse> checkInstanceAccess =
        genForCheckInstanceAccess();

    private static HttpRequestDef<CheckInstanceAccessRequest, CheckInstanceAccessResponse> genForCheckInstanceAccess() {
        // basic
        HttpRequestDef.Builder<CheckInstanceAccessRequest, CheckInstanceAccessResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckInstanceAccessRequest.class, CheckInstanceAccessResponse.class)
                .withName("CheckInstanceAccess")
                .withUri("/v2/instances/{instance_id}/access")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckInstanceAccessRequest::getInstanceId,
                CheckInstanceAccessRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckNameRequest, CheckNameResponse> checkName = genForCheckName();

    private static HttpRequestDef<CheckNameRequest, CheckNameResponse> genForCheckName() {
        // basic
        HttpRequestDef.Builder<CheckNameRequest, CheckNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckNameRequest.class, CheckNameResponse.class)
                .withName("CheckName")
                .withUri("/v2/instances/duplicate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("display_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckNameRequest::getDisplayName, CheckNameRequest::setDisplayName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> createInstance =
        genForCreateInstance();

    private static HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> genForCreateInstance() {
        // basic
        HttpRequestDef.Builder<CreateInstanceRequest, CreateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceRequest.class, CreateInstanceResponse.class)
                .withName("CreateInstance")
                .withUri("/v2/{org_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("org_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceRequest::getOrgId, CreateInstanceRequest::setOrgId));
        builder.<InstanceParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceParam.class),
            f -> f.withMarshaller(CreateInstanceRequest::getBody, CreateInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceBy3rdRequest, CreateInstanceBy3rdResponse> createInstanceBy3rd =
        genForCreateInstanceBy3rd();

    private static HttpRequestDef<CreateInstanceBy3rdRequest, CreateInstanceBy3rdResponse> genForCreateInstanceBy3rd() {
        // basic
        HttpRequestDef.Builder<CreateInstanceBy3rdRequest, CreateInstanceBy3rdResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceBy3rdRequest.class, CreateInstanceBy3rdResponse.class)
                .withName("CreateInstanceBy3rd")
                .withUri("/v2/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_label",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceBy3rdRequest::getInstanceLabel,
                CreateInstanceBy3rdRequest::setInstanceLabel));
        builder.<InstanceEdgeParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceEdgeParam.class),
            f -> f.withMarshaller(CreateInstanceBy3rdRequest::getBody, CreateInstanceBy3rdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance =
        genForDeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genForDeleteInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRequest, DeleteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstanceRequest.class, DeleteInstanceResponse.class)
                .withName("DeleteInstance")
                .withUri("/v2/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getInstanceId, DeleteInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances =
        genForListInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForListInstances() {
        // basic
        HttpRequestDef.Builder<ListInstancesRequest, ListInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesRequest.class, ListInstancesResponse.class)
                .withName("ListInstances")
                .withUri("/v2/instances")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListInstancesRequest::getLimit, ListInstancesRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListInstancesRequest::getOffset, ListInstancesRequest::setOffset));
        builder.<Boolean>withRequestField("is_temporary",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListInstancesRequest::getIsTemporary, ListInstancesRequest::setIsTemporary));
        builder.<String>withRequestField("label",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getLabel, ListInstancesRequest::setLabel));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getSearch, ListInstancesRequest::setSearch));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getSortDir, ListInstancesRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getSortKey, ListInstancesRequest::setSortKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOrgInstancesRequest, ListOrgInstancesResponse> listOrgInstances =
        genForListOrgInstances();

    private static HttpRequestDef<ListOrgInstancesRequest, ListOrgInstancesResponse> genForListOrgInstances() {
        // basic
        HttpRequestDef.Builder<ListOrgInstancesRequest, ListOrgInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListOrgInstancesRequest.class, ListOrgInstancesResponse.class)
                .withName("ListOrgInstances")
                .withUri("/v2/{org_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("org_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrgInstancesRequest::getOrgId, ListOrgInstancesRequest::setOrgId));
        builder.<Boolean>withRequestField("is_temporary",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListOrgInstancesRequest::getIsTemporary, ListOrgInstancesRequest::setIsTemporary));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListOrgInstancesRequest::getLimit, ListOrgInstancesRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListOrgInstancesRequest::getOffset, ListOrgInstancesRequest::setOffset));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrgInstancesRequest::getSearch, ListOrgInstancesRequest::setSearch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> showInstance = genForShowInstance();

    private static HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> genForShowInstance() {
        // basic
        HttpRequestDef.Builder<ShowInstanceRequest, ShowInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceRequest.class, ShowInstanceResponse.class)
                .withName("ShowInstance")
                .withUri("/v2/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRequest::getInstanceId, ShowInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceStatusInfoRequest, ShowInstanceStatusInfoResponse> showInstanceStatusInfo =
        genForShowInstanceStatusInfo();

    private static HttpRequestDef<ShowInstanceStatusInfoRequest, ShowInstanceStatusInfoResponse> genForShowInstanceStatusInfo() {
        // basic
        HttpRequestDef.Builder<ShowInstanceStatusInfoRequest, ShowInstanceStatusInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowInstanceStatusInfoRequest.class, ShowInstanceStatusInfoResponse.class)
            .withName("ShowInstanceStatusInfo")
            .withUri("/v2/instances/{instance_id}/status")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceStatusInfoRequest::getInstanceId,
                ShowInstanceStatusInfoRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartInstanceRequest, StartInstanceResponse> startInstance =
        genForStartInstance();

    private static HttpRequestDef<StartInstanceRequest, StartInstanceResponse> genForStartInstance() {
        // basic
        HttpRequestDef.Builder<StartInstanceRequest, StartInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, StartInstanceRequest.class, StartInstanceResponse.class)
                .withName("StartInstance")
                .withUri("/v2/instances/{instance_id}/runtime")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartInstanceRequest::getInstanceId, StartInstanceRequest::setInstanceId));
        builder.<StartInstanceParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartInstanceParam.class),
            f -> f.withMarshaller(StartInstanceRequest::getBody, StartInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopInstanceRequest, StopInstanceResponse> stopInstance = genForStopInstance();

    private static HttpRequestDef<StopInstanceRequest, StopInstanceResponse> genForStopInstance() {
        // basic
        HttpRequestDef.Builder<StopInstanceRequest, StopInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, StopInstanceRequest.class, StopInstanceResponse.class)
                .withName("StopInstance")
                .withUri("/v2/instances/{instance_id}/runtime")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopInstanceRequest::getInstanceId, StopInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> updateInstance =
        genForUpdateInstance();

    private static HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> genForUpdateInstance() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceRequest, UpdateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceRequest.class, UpdateInstanceResponse.class)
                .withName("UpdateInstance")
                .withUri("/v2/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getInstanceId, UpdateInstanceRequest::setInstanceId));
        builder.<InstanceUpdateParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceUpdateParam.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getBody, UpdateInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceActivityRequest, UpdateInstanceActivityResponse> updateInstanceActivity =
        genForUpdateInstanceActivity();

    private static HttpRequestDef<UpdateInstanceActivityRequest, UpdateInstanceActivityResponse> genForUpdateInstanceActivity() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceActivityRequest, UpdateInstanceActivityResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateInstanceActivityRequest.class, UpdateInstanceActivityResponse.class)
            .withName("UpdateInstanceActivity")
            .withUri("/v2/instances/{instance_id}/activity")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceActivityRequest::getInstanceId,
                UpdateInstanceActivityRequest::setInstanceId));

        // response

        return builder.build();
    }

}
