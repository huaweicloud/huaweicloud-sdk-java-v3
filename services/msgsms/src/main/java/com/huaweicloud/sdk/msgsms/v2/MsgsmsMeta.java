package com.huaweicloud.sdk.msgsms.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.msgsms.v2.model.*;

import java.util.List;

@SuppressWarnings("unchecked")
public class MsgsmsMeta {

    public static final HttpRequestDef<CreateAppRequest, CreateAppResponse> createApp = genForcreateApp();

    private static HttpRequestDef<CreateAppRequest, CreateAppResponse> genForcreateApp() {
        // basic
        HttpRequestDef.Builder<CreateAppRequest, CreateAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppRequest.class, CreateAppResponse.class)
                .withName("CreateApp")
                .withUri("/v2/{project_id}/msgsms/apps")
                .withContentType("application/json");

        // requests
        builder.<SmsAppAddReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SmsAppAddReq.class),
            f -> f.withMarshaller(CreateAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppDetailsRequest, ListAppDetailsResponse> listAppDetails =
        genForlistAppDetails();

    private static HttpRequestDef<ListAppDetailsRequest, ListAppDetailsResponse> genForlistAppDetails() {
        // basic
        HttpRequestDef.Builder<ListAppDetailsRequest, ListAppDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppDetailsRequest.class, ListAppDetailsResponse.class)
                .withName("ListAppDetails")
                .withUri("/v2/{project_id}/msgsms/apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppDetailsRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppDetailsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppDetailsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppDetailsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppDetailsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppDetailsRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppDetailsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppDetailsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppDetailsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppRequest, ShowAppResponse> showApp = genForshowApp();

    private static HttpRequestDef<ShowAppRequest, ShowAppResponse> genForshowApp() {
        // basic
        HttpRequestDef.Builder<ShowAppRequest, ShowAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAppRequest.class, ShowAppResponse.class)
                .withName("ShowApp")
                .withUri("/v2/{project_id}/msgsms/apps/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppCountRequest, ShowAppCountResponse> showAppCount = genForshowAppCount();

    private static HttpRequestDef<ShowAppCountRequest, ShowAppCountResponse> genForshowAppCount() {
        // basic
        HttpRequestDef.Builder<ShowAppCountRequest, ShowAppCountResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAppCountRequest.class, ShowAppCountResponse.class)
                .withName("ShowAppCount")
                .withUri("/v2/{project_id}/msgsms/apps-count")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppCountRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppRequest, UpdateAppResponse> updateApp = genForupdateApp();

    private static HttpRequestDef<UpdateAppRequest, UpdateAppResponse> genForupdateApp() {
        // basic
        HttpRequestDef.Builder<UpdateAppRequest, UpdateAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAppRequest.class, UpdateAppResponse.class)
                .withName("UpdateApp")
                .withUri("/v2/{project_id}/msgsms/apps/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<SmsAppUpdateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SmsAppUpdateReq.class),
            f -> f.withMarshaller(UpdateAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSignatureRequest, CreateSignatureResponse> createSignature =
        genForcreateSignature();

    private static HttpRequestDef<CreateSignatureRequest, CreateSignatureResponse> genForcreateSignature() {
        // basic
        HttpRequestDef.Builder<CreateSignatureRequest, CreateSignatureResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSignatureRequest.class, CreateSignatureResponse.class)
                .withName("CreateSignature")
                .withUri("/v2/{project_id}/msgsms/signatures")
                .withContentType("application/json");

        // requests
        builder.<SmsSignatureReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SmsSignatureReq.class),
            f -> f.withMarshaller(CreateSignatureRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSignatureRequest, DeleteSignatureResponse> deleteSignature =
        genFordeleteSignature();

    private static HttpRequestDef<DeleteSignatureRequest, DeleteSignatureResponse> genFordeleteSignature() {
        // basic
        HttpRequestDef.Builder<DeleteSignatureRequest, DeleteSignatureResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSignatureRequest.class, DeleteSignatureResponse.class)
                .withName("DeleteSignature")
                .withUri("/v2/{project_id}/msgsms/signatures/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSignatureRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableSignatureRequest, EnableSignatureResponse> enableSignature =
        genForenableSignature();

    private static HttpRequestDef<EnableSignatureRequest, EnableSignatureResponse> genForenableSignature() {
        // basic
        HttpRequestDef.Builder<EnableSignatureRequest, EnableSignatureResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, EnableSignatureRequest.class, EnableSignatureResponse.class)
                .withName("EnableSignature")
                .withUri("/v2/{project_id}/msgsms/signatures/{id}/active")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableSignatureRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSignatureDetailsRequest, ListSignatureDetailsResponse> listSignatureDetails =
        genForlistSignatureDetails();

    private static HttpRequestDef<ListSignatureDetailsRequest, ListSignatureDetailsResponse> genForlistSignatureDetails() {
        // basic
        HttpRequestDef.Builder<ListSignatureDetailsRequest, ListSignatureDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSignatureDetailsRequest.class, ListSignatureDetailsResponse.class)
            .withName("ListSignatureDetails")
            .withUri("/v2/{project_id}/msgsms/signatures")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureDetailsRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureDetailsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureDetailsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSignatureDetailsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSignatureDetailsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("signature_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureDetailsRequest::getSignatureId, (req, v) -> {
                req.setSignatureId(v);
            }));
        builder.<String>withRequestField("signature_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureDetailsRequest::getSignatureName, (req, v) -> {
                req.setSignatureName(v);
            }));
        builder.<String>withRequestField("signature_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureDetailsRequest::getSignatureType, (req, v) -> {
                req.setSignatureType(v);
            }));
        builder.<String>withRequestField("site",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureDetailsRequest::getSite, (req, v) -> {
                req.setSite(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureDetailsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureDetailsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureDetailsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSignatureRequest, ShowSignatureResponse> showSignature =
        genForshowSignature();

    private static HttpRequestDef<ShowSignatureRequest, ShowSignatureResponse> genForshowSignature() {
        // basic
        HttpRequestDef.Builder<ShowSignatureRequest, ShowSignatureResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSignatureRequest.class, ShowSignatureResponse.class)
                .withName("ShowSignature")
                .withUri("/v2/{project_id}/msgsms/signatures/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSignatureRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSignatureFileRequest, ShowSignatureFileResponse> showSignatureFile =
        genForshowSignatureFile();

    private static HttpRequestDef<ShowSignatureFileRequest, ShowSignatureFileResponse> genForshowSignatureFile() {
        // basic
        HttpRequestDef.Builder<ShowSignatureFileRequest, ShowSignatureFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSignatureFileRequest.class, ShowSignatureFileResponse.class)
                .withName("ShowSignatureFile")
                .withUri("/v2/{project_id}/msgsms/upload-files")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("file_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSignatureFileRequest::getFileId, (req, v) -> {
                req.setFileId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSignatureRequest, UpdateSignatureResponse> updateSignature =
        genForupdateSignature();

    private static HttpRequestDef<UpdateSignatureRequest, UpdateSignatureResponse> genForupdateSignature() {
        // basic
        HttpRequestDef.Builder<UpdateSignatureRequest, UpdateSignatureResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSignatureRequest.class, UpdateSignatureResponse.class)
                .withName("UpdateSignature")
                .withUri("/v2/{project_id}/msgsms/signatures/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSignatureRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<SmsSignatureReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SmsSignatureReq.class),
            f -> f.withMarshaller(UpdateSignatureRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadSignatureFileRequest, UploadSignatureFileResponse> uploadSignatureFile =
        genForuploadSignatureFile();

    private static HttpRequestDef<UploadSignatureFileRequest, UploadSignatureFileResponse> genForuploadSignatureFile() {
        // basic
        HttpRequestDef.Builder<UploadSignatureFileRequest, UploadSignatureFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadSignatureFileRequest.class, UploadSignatureFileResponse.class)
                .withName("UploadSignatureFile")
                .withUri("/v2/{project_id}/msgsms/upload-files")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("file_desc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadSignatureFileRequest::getFileDesc, (req, v) -> {
                req.setFileDesc(v);
            }));
        builder.<UploadSignatureFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadSignatureFileRequestBody.class),
            f -> f.withMarshaller(UploadSignatureFileRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemplateRequest, CreateTemplateResponse> createTemplate =
        genForcreateTemplate();

    private static HttpRequestDef<CreateTemplateRequest, CreateTemplateResponse> genForcreateTemplate() {
        // basic
        HttpRequestDef.Builder<CreateTemplateRequest, CreateTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTemplateRequest.class, CreateTemplateResponse.class)
                .withName("CreateTemplate")
                .withUri("/v2/{project_id}/msgsms/templates")
                .withContentType("application/json");

        // requests
        builder.<SmsTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SmsTemplateReq.class),
            f -> f.withMarshaller(CreateTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplate =
        genFordeleteTemplate();

    private static HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> genFordeleteTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteTemplateRequest, DeleteTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTemplateRequest.class, DeleteTemplateResponse.class)
                .withName("DeleteTemplate")
                .withUri("/v2/{project_id}/msgsms/templates/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSendCountryDetailsRequest, ListSendCountryDetailsResponse> listSendCountryDetails =
        genForlistSendCountryDetails();

    private static HttpRequestDef<ListSendCountryDetailsRequest, ListSendCountryDetailsResponse> genForlistSendCountryDetails() {
        // basic
        HttpRequestDef.Builder<ListSendCountryDetailsRequest, ListSendCountryDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSendCountryDetailsRequest.class, ListSendCountryDetailsResponse.class)
            .withName("ListSendCountryDetails")
            .withUri("/v2/{project_id}/msgsms/country")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("country_name_en",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSendCountryDetailsRequest::getCountryNameEn, (req, v) -> {
                req.setCountryNameEn(v);
            }));
        builder.<String>withRequestField("country_name_zh",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSendCountryDetailsRequest::getCountryNameZh, (req, v) -> {
                req.setCountryNameZh(v);
            }));

        // response
        builder.<List<SmsCountryResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSendCountryDetailsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(SmsCountryResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplateDetailsRequest, ListTemplateDetailsResponse> listTemplateDetails =
        genForlistTemplateDetails();

    private static HttpRequestDef<ListTemplateDetailsRequest, ListTemplateDetailsResponse> genForlistTemplateDetails() {
        // basic
        HttpRequestDef.Builder<ListTemplateDetailsRequest, ListTemplateDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTemplateDetailsRequest.class, ListTemplateDetailsResponse.class)
                .withName("ListTemplateDetails")
                .withUri("/v2/{project_id}/msgsms/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getAppKey, (req, v) -> {
                req.setAppKey(v);
            }));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("flow_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getFlowStatus, (req, v) -> {
                req.setFlowStatus(v);
            }));
        builder.<String>withRequestField("has_variable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getHasVariable, (req, v) -> {
                req.setHasVariable(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<String>withRequestField("sign_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getSignName, (req, v) -> {
                req.setSignName(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<String>withRequestField("template_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getTemplateName, (req, v) -> {
                req.setTemplateName(v);
            }));
        builder.<String>withRequestField("template_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getTemplateType, (req, v) -> {
                req.setTemplateType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplateVarilableDetailsRequest, ListTemplateVarilableDetailsResponse> listTemplateVarilableDetails =
        genForlistTemplateVarilableDetails();

    private static HttpRequestDef<ListTemplateVarilableDetailsRequest, ListTemplateVarilableDetailsResponse> genForlistTemplateVarilableDetails() {
        // basic
        HttpRequestDef.Builder<ListTemplateVarilableDetailsRequest, ListTemplateVarilableDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListTemplateVarilableDetailsRequest.class,
                    ListTemplateVarilableDetailsResponse.class)
                .withName("ListTemplateVarilableDetails")
                .withUri("/v2/{project_id}/msgsms/templates/{id}/varilable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateVarilableDetailsRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateRequest, ShowTemplateResponse> showTemplate = genForshowTemplate();

    private static HttpRequestDef<ShowTemplateRequest, ShowTemplateResponse> genForshowTemplate() {
        // basic
        HttpRequestDef.Builder<ShowTemplateRequest, ShowTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTemplateRequest.class, ShowTemplateResponse.class)
                .withName("ShowTemplate")
                .withUri("/v2/{project_id}/msgsms/templates/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTemplateRequest, UpdateTemplateResponse> updateTemplate =
        genForupdateTemplate();

    private static HttpRequestDef<UpdateTemplateRequest, UpdateTemplateResponse> genForupdateTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateTemplateRequest, UpdateTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTemplateRequest.class, UpdateTemplateResponse.class)
                .withName("UpdateTemplate")
                .withUri("/v2/{project_id}/msgsms/templates/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTemplateRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<SmsTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SmsTemplateReq.class),
            f -> f.withMarshaller(UpdateTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
