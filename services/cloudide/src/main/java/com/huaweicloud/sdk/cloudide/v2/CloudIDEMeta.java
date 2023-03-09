package com.huaweicloud.sdk.cloudide.v2;

import com.huaweicloud.sdk.cloudide.v2.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CloudIDEMeta {

    public static final HttpRequestDef<AddExtensionEvaluationRequest, AddExtensionEvaluationResponse> addExtensionEvaluation =
        genForaddExtensionEvaluation();

    private static HttpRequestDef<AddExtensionEvaluationRequest, AddExtensionEvaluationResponse> genForaddExtensionEvaluation() {
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
            f -> f.withMarshaller(AddExtensionEvaluationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddExtensionEvaluationReplyRequest, AddExtensionEvaluationReplyResponse> addExtensionEvaluationReply =
        genForaddExtensionEvaluationReply();

    private static HttpRequestDef<AddExtensionEvaluationReplyRequest, AddExtensionEvaluationReplyResponse> genForaddExtensionEvaluationReply() {
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
            f -> f.withMarshaller(AddExtensionEvaluationReplyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddExtensionStarRequest, AddExtensionStarResponse> addExtensionStar =
        genForaddExtensionStar();

    private static HttpRequestDef<AddExtensionStarRequest, AddExtensionStarResponse> genForaddExtensionStar() {
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
            f -> f.withMarshaller(AddExtensionStarRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckMaliciousExtensionEvaluationRequest, CheckMaliciousExtensionEvaluationResponse> checkMaliciousExtensionEvaluation =
        genForcheckMaliciousExtensionEvaluation();

    private static HttpRequestDef<CheckMaliciousExtensionEvaluationRequest, CheckMaliciousExtensionEvaluationResponse> genForcheckMaliciousExtensionEvaluation() {
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
            f -> f.withMarshaller(CheckMaliciousExtensionEvaluationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateExtensionAuthorizationRequest, CreateExtensionAuthorizationResponse> createExtensionAuthorization =
        genForcreateExtensionAuthorization();

    private static HttpRequestDef<CreateExtensionAuthorizationRequest, CreateExtensionAuthorizationResponse> genForcreateExtensionAuthorization() {
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
            f -> f.withMarshaller(CreateExtensionAuthorizationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ExtensionAuthorization>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExtensionAuthorization.class),
            f -> f.withMarshaller(CreateExtensionAuthorizationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEvaluationRequest, DeleteEvaluationResponse> deleteEvaluation =
        genFordeleteEvaluation();

    private static HttpRequestDef<DeleteEvaluationRequest, DeleteEvaluationResponse> genFordeleteEvaluation() {
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
            f -> f.withMarshaller(DeleteEvaluationRequest::getEvaluationId, (req, v) -> {
                req.setEvaluationId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEvaluationReplyRequest, DeleteEvaluationReplyResponse> deleteEvaluationReply =
        genFordeleteEvaluationReply();

    private static HttpRequestDef<DeleteEvaluationReplyRequest, DeleteEvaluationReplyResponse> genFordeleteEvaluationReply() {
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
            f -> f.withMarshaller(DeleteEvaluationReplyRequest::getReplyId, (req, v) -> {
                req.setReplyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListExtensionsRequest, ListExtensionsResponse> listExtensions =
        genForlistExtensions();

    private static HttpRequestDef<ListExtensionsRequest, ListExtensionsResponse> genForlistExtensions() {
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
            f -> f.withMarshaller(ListExtensionsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectTemplatesRequest, ListProjectTemplatesResponse> listProjectTemplates =
        genForlistProjectTemplates();

    private static HttpRequestDef<ListProjectTemplatesRequest, ListProjectTemplatesResponse> genForlistProjectTemplates() {
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
            f -> f.withMarshaller(ListProjectTemplatesRequest::getArch, (req, v) -> {
                req.setArch(v);
            }));
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectTemplatesRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublisherRequest, ListPublisherResponse> listPublisher =
        genForlistPublisher();

    private static HttpRequestDef<ListPublisherRequest, ListPublisherResponse> genForlistPublisher() {
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
            f -> f.withMarshaller(ListPublisherRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStacksRequest, ListStacksResponse> listStacks = genForlistStacks();

    private static HttpRequestDef<ListStacksRequest, ListStacksResponse> genForlistStacks() {
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
            f -> f.withMarshaller(ListStacksRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAccountStatusRequest, ShowAccountStatusResponse> showAccountStatus =
        genForshowAccountStatus();

    private static HttpRequestDef<ShowAccountStatusRequest, ShowAccountStatusResponse> genForshowAccountStatus() {
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
        genForshowCategoryList();

    private static HttpRequestDef<ShowCategoryListRequest, ShowCategoryListResponse> genForshowCategoryList() {
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
            f -> f.withMarshaller(ShowCategoryListRequest::getPageNum, (req, v) -> {
                req.setPageNum(v);
            }));
        builder.<Long>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowCategoryListRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<String>withRequestField("scene_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCategoryListRequest::getSceneName, (req, v) -> {
                req.setSceneName(v);
            }));
        builder.<Integer>withRequestField("support_ide",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCategoryListRequest::getSupportIde, (req, v) -> {
                req.setSupportIde(v);
            }));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCategoryListRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowExtensionAuthorizationRequest, ShowExtensionAuthorizationResponse> showExtensionAuthorization =
        genForshowExtensionAuthorization();

    private static HttpRequestDef<ShowExtensionAuthorizationRequest, ShowExtensionAuthorizationResponse> genForshowExtensionAuthorization() {
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
            f -> f.withMarshaller(ShowExtensionAuthorizationRequest::getExtensionVersion, (req, v) -> {
                req.setExtensionVersion(v);
            }));
        builder.<String>withRequestField("identifier",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExtensionAuthorizationRequest::getIdentifier, (req, v) -> {
                req.setIdentifier(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExtensionAuthorizationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowExtensionDetailRequest, ShowExtensionDetailResponse> showExtensionDetail =
        genForshowExtensionDetail();

    private static HttpRequestDef<ShowExtensionDetailRequest, ShowExtensionDetailResponse> genForshowExtensionDetail() {
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
            f -> f.withMarshaller(ShowExtensionDetailRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowExtensionEvaluationRequest, ShowExtensionEvaluationResponse> showExtensionEvaluation =
        genForshowExtensionEvaluation();

    private static HttpRequestDef<ShowExtensionEvaluationRequest, ShowExtensionEvaluationResponse> genForshowExtensionEvaluation() {
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
            f -> f.withMarshaller(ShowExtensionEvaluationRequest::getExtensionId, (req, v) -> {
                req.setExtensionId(v);
            }));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowExtensionEvaluationRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowExtensionEvaluationRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowExtensionEvaluationStarRequest, ShowExtensionEvaluationStarResponse> showExtensionEvaluationStar =
        genForshowExtensionEvaluationStar();

    private static HttpRequestDef<ShowExtensionEvaluationStarRequest, ShowExtensionEvaluationStarResponse> genForshowExtensionEvaluationStar() {
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
            f -> f.withMarshaller(ShowExtensionEvaluationStarRequest::getExtensionId, (req, v) -> {
                req.setExtensionId(v);
            }));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowExtensionEvaluationStarRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowExtensionEvaluationStarRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPriceRequest, ShowPriceResponse> showPrice = genForshowPrice();

    private static HttpRequestDef<ShowPriceRequest, ShowPriceResponse> genForshowPrice() {
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
        genForuploadExtensionFile();

    private static HttpRequestDef<UploadExtensionFileRequest, UploadExtensionFileResponse> genForuploadExtensionFile() {
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
            f -> f.withMarshaller(UploadExtensionFileRequest::getOfficial, (req, v) -> {
                req.setOfficial(v);
            }));
        builder.<UploadExtensionFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadExtensionFileRequestBody.class),
            f -> f.withMarshaller(UploadExtensionFileRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAcceptanceRequest, CreateAcceptanceResponse> createAcceptance =
        genForcreateAcceptance();

    private static HttpRequestDef<CreateAcceptanceRequest, CreateAcceptanceResponse> genForcreateAcceptance() {
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
            f -> f.withMarshaller(CreateAcceptanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLoginRequest, CreateLoginResponse> createLogin = genForcreateLogin();

    private static HttpRequestDef<CreateLoginRequest, CreateLoginResponse> genForcreateLogin() {
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
            f -> f.withMarshaller(CreateLoginRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRequestRequest, CreateRequestResponse> createRequest =
        genForcreateRequest();

    private static HttpRequestDef<CreateRequestRequest, CreateRequestResponse> genForcreateRequest() {
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
            f -> f.withMarshaller(CreateRequestRequest::getTopn, (req, v) -> {
                req.setTopn(v);
            }));
        builder.<String>withRequestField("scenario",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRequestRequest::getScenario, (req, v) -> {
                req.setScenario(v);
            }));
        builder.<Boolean>withRequestField("resubmit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(CreateRequestRequest::getResubmit, (req, v) -> {
                req.setResubmit(v);
            }));
        builder.<String>withRequestField("model_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRequestRequest::getModelId, (req, v) -> {
                req.setModelId(v);
            }));
        builder.<CreateRequestRequest.RequestTypeEnum>withRequestField("request_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateRequestRequest.RequestTypeEnum.class),
            f -> f.withMarshaller(CreateRequestRequest::getRequestType, (req, v) -> {
                req.setRequestType(v);
            }));
        builder.<PropertiesSchema>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PropertiesSchema.class),
            f -> f.withMarshaller(CreateRequestRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResultRequest, ShowResultResponse> showResult = genForshowResult();

    private static HttpRequestDef<ShowResultRequest, ShowResultResponse> genForshowResult() {
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
            f -> f.withMarshaller(ShowResultRequest::getRequestId, (req, v) -> {
                req.setRequestId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckInstanceAccessRequest, CheckInstanceAccessResponse> checkInstanceAccess =
        genForcheckInstanceAccess();

    private static HttpRequestDef<CheckInstanceAccessRequest, CheckInstanceAccessResponse> genForcheckInstanceAccess() {
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
            f -> f.withMarshaller(CheckInstanceAccessRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckNameRequest, CheckNameResponse> checkName = genForcheckName();

    private static HttpRequestDef<CheckNameRequest, CheckNameResponse> genForcheckName() {
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
            f -> f.withMarshaller(CheckNameRequest::getDisplayName, (req, v) -> {
                req.setDisplayName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> createInstance =
        genForcreateInstance();

    private static HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> genForcreateInstance() {
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
            f -> f.withMarshaller(CreateInstanceRequest::getOrgId, (req, v) -> {
                req.setOrgId(v);
            }));
        builder.<InstanceParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceParam.class),
            f -> f.withMarshaller(CreateInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceBy3rdRequest, CreateInstanceBy3rdResponse> createInstanceBy3rd =
        genForcreateInstanceBy3rd();

    private static HttpRequestDef<CreateInstanceBy3rdRequest, CreateInstanceBy3rdResponse> genForcreateInstanceBy3rd() {
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
            f -> f.withMarshaller(CreateInstanceBy3rdRequest::getInstanceLabel, (req, v) -> {
                req.setInstanceLabel(v);
            }));
        builder.<InstanceEdgeParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceEdgeParam.class),
            f -> f.withMarshaller(CreateInstanceBy3rdRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance =
        genFordeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genFordeleteInstance() {
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
            f -> f.withMarshaller(DeleteInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances =
        genForlistInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForlistInstances() {
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
            f -> f.withMarshaller(ListInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Boolean>withRequestField("is_temporary",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListInstancesRequest::getIsTemporary, (req, v) -> {
                req.setIsTemporary(v);
            }));
        builder.<String>withRequestField("label",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getLabel, (req, v) -> {
                req.setLabel(v);
            }));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getSearch, (req, v) -> {
                req.setSearch(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOrgInstancesRequest, ListOrgInstancesResponse> listOrgInstances =
        genForlistOrgInstances();

    private static HttpRequestDef<ListOrgInstancesRequest, ListOrgInstancesResponse> genForlistOrgInstances() {
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
            f -> f.withMarshaller(ListOrgInstancesRequest::getOrgId, (req, v) -> {
                req.setOrgId(v);
            }));
        builder.<Boolean>withRequestField("is_temporary",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListOrgInstancesRequest::getIsTemporary, (req, v) -> {
                req.setIsTemporary(v);
            }));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListOrgInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListOrgInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrgInstancesRequest::getSearch, (req, v) -> {
                req.setSearch(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> showInstance = genForshowInstance();

    private static HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> genForshowInstance() {
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
            f -> f.withMarshaller(ShowInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceStatusInfoRequest, ShowInstanceStatusInfoResponse> showInstanceStatusInfo =
        genForshowInstanceStatusInfo();

    private static HttpRequestDef<ShowInstanceStatusInfoRequest, ShowInstanceStatusInfoResponse> genForshowInstanceStatusInfo() {
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
            f -> f.withMarshaller(ShowInstanceStatusInfoRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartInstanceRequest, StartInstanceResponse> startInstance =
        genForstartInstance();

    private static HttpRequestDef<StartInstanceRequest, StartInstanceResponse> genForstartInstance() {
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
            f -> f.withMarshaller(StartInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<StartInstanceParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartInstanceParam.class),
            f -> f.withMarshaller(StartInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopInstanceRequest, StopInstanceResponse> stopInstance = genForstopInstance();

    private static HttpRequestDef<StopInstanceRequest, StopInstanceResponse> genForstopInstance() {
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
            f -> f.withMarshaller(StopInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> updateInstance =
        genForupdateInstance();

    private static HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> genForupdateInstance() {
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
            f -> f.withMarshaller(UpdateInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<InstanceUpdateParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceUpdateParam.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceActivityRequest, UpdateInstanceActivityResponse> updateInstanceActivity =
        genForupdateInstanceActivity();

    private static HttpRequestDef<UpdateInstanceActivityRequest, UpdateInstanceActivityResponse> genForupdateInstanceActivity() {
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
            f -> f.withMarshaller(UpdateInstanceActivityRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

}
