package com.huaweicloud.sdk.meeting.v1;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.meeting.v1.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class MeetingMeta {

    public static final HttpRequestDef<AddCorpRequest, AddCorpResponse> addCorp = genForaddCorp();

    private static HttpRequestDef<AddCorpRequest, AddCorpResponse> genForaddCorp() {
        // basic
        HttpRequestDef.Builder<AddCorpRequest, AddCorpResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddCorpRequest.class, AddCorpResponse.class)
                .withName("AddCorp")
                .withUri("/v1/usg/dcs/sp/corp")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddCorpRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddCorpRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AddCorpDTO.class,
            f -> f.withMarshaller(AddCorpRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<AddCorpAdminRequest, AddCorpAdminResponse> addCorpAdmin = genForaddCorpAdmin();

    private static HttpRequestDef<AddCorpAdminRequest, AddCorpAdminResponse> genForaddCorpAdmin() {
        // basic
        HttpRequestDef.Builder<AddCorpAdminRequest, AddCorpAdminResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddCorpAdminRequest.class, AddCorpAdminResponse.class)
                .withName("AddCorpAdmin")
                .withUri("/v1/usg/dcs/corp/admin")
                .withContentType("application/json");

        // requests
        builder.withRequestField("accountType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(AddCorpAdminRequest::getAccountType, (req, v) -> {
                req.setAccountType(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddCorpAdminRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddCorpAdminRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CorpAdminDTO.class,
            f -> f.withMarshaller(AddCorpAdminRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<AddDepartmentRequest, AddDepartmentResponse> addDepartment = genForaddDepartment();

    private static HttpRequestDef<AddDepartmentRequest, AddDepartmentResponse> genForaddDepartment() {
        // basic
        HttpRequestDef.Builder<AddDepartmentRequest, AddDepartmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddDepartmentRequest.class, AddDepartmentResponse.class)
                .withName("AddDepartment")
                .withUri("/v1/usg/dcs/corp/dept")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddDepartmentRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddDepartmentRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DeptDTO.class,
            f -> f.withMarshaller(AddDepartmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<AddDeviceRequest, AddDeviceResponse> addDevice = genForaddDevice();

    private static HttpRequestDef<AddDeviceRequest, AddDeviceResponse> genForaddDevice() {
        // basic
        HttpRequestDef.Builder<AddDeviceRequest, AddDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddDeviceRequest.class, AddDeviceResponse.class)
                .withName("AddDevice")
                .withUri("/v1/usg/dcs/corp/device")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddDeviceRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddDeviceRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AddDeviceDTO.class,
            f -> f.withMarshaller(AddDeviceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<AddProgramRequest, AddProgramResponse> addProgram = genForaddProgram();

    private static HttpRequestDef<AddProgramRequest, AddProgramResponse> genForaddProgram() {
        // basic
        HttpRequestDef.Builder<AddProgramRequest, AddProgramResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddProgramRequest.class, AddProgramResponse.class)
                .withName("AddProgram")
                .withUri("/v1/usg/sss/programs")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddProgramRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddProgramRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateProgramRequestDTO.class,
            f -> f.withMarshaller(AddProgramRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<AddPublicationRequest, AddPublicationResponse> addPublication = genForaddPublication();

    private static HttpRequestDef<AddPublicationRequest, AddPublicationResponse> genForaddPublication() {
        // basic
        HttpRequestDef.Builder<AddPublicationRequest, AddPublicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddPublicationRequest.class, AddPublicationResponse.class)
                .withName("AddPublication")
                .withUri("/v1/usg/sss/publications")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddPublicationRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddPublicationRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreatePublicationRequestDTO.class,
            f -> f.withMarshaller(AddPublicationRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<AddResourceRequest, AddResourceResponse> addResource = genForaddResource();

    private static HttpRequestDef<AddResourceRequest, AddResourceResponse> genForaddResource() {
        // basic
        HttpRequestDef.Builder<AddResourceRequest, AddResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddResourceRequest.class, AddResourceResponse.class)
                .withName("AddResource")
                .withUri("/v1/usg/dcs/sp/corp/{corp_id}/resource")
                .withContentType("application/json");

        // requests
        builder.withRequestField("corp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AddResourceRequest::getCorpId, (req, v) -> {
                req.setCorpId(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddResourceRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddResourceRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(AddResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(ResourceDTO.class)
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<AddToPersonalSpaceRequest, AddToPersonalSpaceResponse> addToPersonalSpace = genForaddToPersonalSpace();

    private static HttpRequestDef<AddToPersonalSpaceRequest, AddToPersonalSpaceResponse> genForaddToPersonalSpace() {
        // basic
        HttpRequestDef.Builder<AddToPersonalSpaceRequest, AddToPersonalSpaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddToPersonalSpaceRequest.class, AddToPersonalSpaceResponse.class)
                .withName("AddToPersonalSpace")
                .withUri("/v1/usg/sss/meeting-files/save-to-personal-space")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddToPersonalSpaceRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddToPersonalSpaceRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            Map.class,
            f -> f.withMarshaller(AddToPersonalSpaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class)
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<AddUserRequest, AddUserResponse> addUser = genForaddUser();

    private static HttpRequestDef<AddUserRequest, AddUserResponse> genForaddUser() {
        // basic
        HttpRequestDef.Builder<AddUserRequest, AddUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddUserRequest.class, AddUserResponse.class)
                .withName("AddUser")
                .withUri("/v1/usg/dcs/corp/member")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddUserRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddUserRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AddUserDTO.class,
            f -> f.withMarshaller(AddUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<AllowGuestUnmuteRequest, AllowGuestUnmuteResponse> allowGuestUnmute = genForallowGuestUnmute();

    private static HttpRequestDef<AllowGuestUnmuteRequest, AllowGuestUnmuteResponse> genForallowGuestUnmute() {
        // basic
        HttpRequestDef.Builder<AllowGuestUnmuteRequest, AllowGuestUnmuteResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, AllowGuestUnmuteRequest.class, AllowGuestUnmuteResponse.class)
                .withName("AllowGuestUnmute")
                .withUri("/v1/mmc/control/conferences/mute/guestUnMute")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AllowGuestUnmuteRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AllowGuestUnmuteRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestAllowUnMuteReqBody.class,
            f -> f.withMarshaller(AllowGuestUnmuteRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<AssociateVmrRequest, AssociateVmrResponse> associateVmr = genForassociateVmr();

    private static HttpRequestDef<AssociateVmrRequest, AssociateVmrResponse> genForassociateVmr() {
        // basic
        HttpRequestDef.Builder<AssociateVmrRequest, AssociateVmrResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateVmrRequest.class, AssociateVmrResponse.class)
                .withName("AssociateVmr")
                .withUri("/v1/usg/dcs/corp/vmr/assign-to-member/{account}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("account",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AssociateVmrRequest::getAccount, (req, v) -> {
                req.setAccount(v);
            })
        );
        builder.withRequestField("accountType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(AssociateVmrRequest::getAccountType, (req, v) -> {
                req.setAccountType(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AssociateVmrRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AssociateVmrRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(AssociateVmrRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class)
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteCorpAdminsRequest, BatchDeleteCorpAdminsResponse> batchDeleteCorpAdmins = genForbatchDeleteCorpAdmins();

    private static HttpRequestDef<BatchDeleteCorpAdminsRequest, BatchDeleteCorpAdminsResponse> genForbatchDeleteCorpAdmins() {
        // basic
        HttpRequestDef.Builder<BatchDeleteCorpAdminsRequest, BatchDeleteCorpAdminsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteCorpAdminsRequest.class, BatchDeleteCorpAdminsResponse.class)
                .withName("BatchDeleteCorpAdmins")
                .withUri("/v1/usg/dcs/corp/admin/delete")
                .withContentType("application/json");

        // requests
        builder.withRequestField("accountType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(BatchDeleteCorpAdminsRequest::getAccountType, (req, v) -> {
                req.setAccountType(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchDeleteCorpAdminsRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchDeleteCorpAdminsRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(BatchDeleteCorpAdminsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class)
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse> batchDeleteDevices = genForbatchDeleteDevices();

    private static HttpRequestDef<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse> genForbatchDeleteDevices() {
        // basic
        HttpRequestDef.Builder<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteDevicesRequest.class, BatchDeleteDevicesResponse.class)
                .withName("BatchDeleteDevices")
                .withUri("/v1/usg/dcs/corp/device/delete")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchDeleteDevicesRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchDeleteDevicesRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(BatchDeleteDevicesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class)
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteMaterialsRequest, BatchDeleteMaterialsResponse> batchDeleteMaterials = genForbatchDeleteMaterials();

    private static HttpRequestDef<BatchDeleteMaterialsRequest, BatchDeleteMaterialsResponse> genForbatchDeleteMaterials() {
        // basic
        HttpRequestDef.Builder<BatchDeleteMaterialsRequest, BatchDeleteMaterialsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteMaterialsRequest.class, BatchDeleteMaterialsResponse.class)
                .withName("BatchDeleteMaterials")
                .withUri("/v1/usg/sss/materials/batch-delete")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchDeleteMaterialsRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchDeleteMaterialsRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(BatchDeleteMaterialsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class)
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteProgramsRequest, BatchDeleteProgramsResponse> batchDeletePrograms = genForbatchDeletePrograms();

    private static HttpRequestDef<BatchDeleteProgramsRequest, BatchDeleteProgramsResponse> genForbatchDeletePrograms() {
        // basic
        HttpRequestDef.Builder<BatchDeleteProgramsRequest, BatchDeleteProgramsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteProgramsRequest.class, BatchDeleteProgramsResponse.class)
                .withName("BatchDeletePrograms")
                .withUri("/v1/usg/sss/programs/batch-delete")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchDeleteProgramsRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchDeleteProgramsRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(BatchDeleteProgramsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class)
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchDeletePublicationsRequest, BatchDeletePublicationsResponse> batchDeletePublications = genForbatchDeletePublications();

    private static HttpRequestDef<BatchDeletePublicationsRequest, BatchDeletePublicationsResponse> genForbatchDeletePublications() {
        // basic
        HttpRequestDef.Builder<BatchDeletePublicationsRequest, BatchDeletePublicationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeletePublicationsRequest.class, BatchDeletePublicationsResponse.class)
                .withName("BatchDeletePublications")
                .withUri("/v1/usg/sss/publications/batch-delete")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchDeletePublicationsRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchDeletePublicationsRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(BatchDeletePublicationsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class)
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteUsersRequest, BatchDeleteUsersResponse> batchDeleteUsers = genForbatchDeleteUsers();

    private static HttpRequestDef<BatchDeleteUsersRequest, BatchDeleteUsersResponse> genForbatchDeleteUsers() {
        // basic
        HttpRequestDef.Builder<BatchDeleteUsersRequest, BatchDeleteUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteUsersRequest.class, BatchDeleteUsersResponse.class)
                .withName("BatchDeleteUsers")
                .withUri("/v1/usg/dcs/corp/member/delete")
                .withContentType("application/json");

        // requests
        builder.withRequestField("accountType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(BatchDeleteUsersRequest::getAccountType, (req, v) -> {
                req.setAccountType(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchDeleteUsersRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchDeleteUsersRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(BatchDeleteUsersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class)
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateDevicesStatusRequest, BatchUpdateDevicesStatusResponse> batchUpdateDevicesStatus = genForbatchUpdateDevicesStatus();

    private static HttpRequestDef<BatchUpdateDevicesStatusRequest, BatchUpdateDevicesStatusResponse> genForbatchUpdateDevicesStatus() {
        // basic
        HttpRequestDef.Builder<BatchUpdateDevicesStatusRequest, BatchUpdateDevicesStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchUpdateDevicesStatusRequest.class, BatchUpdateDevicesStatusResponse.class)
                .withName("BatchUpdateDevicesStatus")
                .withUri("/v1/usg/dcs/corp/device/status/{value}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("value",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchUpdateDevicesStatusRequest.ValueEnum.class,
            f -> f.withMarshaller(BatchUpdateDevicesStatusRequest::getValue, (req, v) -> {
                req.setValue(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchUpdateDevicesStatusRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchUpdateDevicesStatusRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(BatchUpdateDevicesStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class)
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateUserStatusRequest, BatchUpdateUserStatusResponse> batchUpdateUserStatus = genForbatchUpdateUserStatus();

    private static HttpRequestDef<BatchUpdateUserStatusRequest, BatchUpdateUserStatusResponse> genForbatchUpdateUserStatus() {
        // basic
        HttpRequestDef.Builder<BatchUpdateUserStatusRequest, BatchUpdateUserStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchUpdateUserStatusRequest.class, BatchUpdateUserStatusResponse.class)
                .withName("BatchUpdateUserStatus")
                .withUri("/v1/usg/dcs/corp/member/status/{value}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("value",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchUpdateUserStatusRequest.ValueEnum.class,
            f -> f.withMarshaller(BatchUpdateUserStatusRequest::getValue, (req, v) -> {
                req.setValue(v);
            })
        );
        builder.withRequestField("accountType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(BatchUpdateUserStatusRequest::getAccountType, (req, v) -> {
                req.setAccountType(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchUpdateUserStatusRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchUpdateUserStatusRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(BatchUpdateUserStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class)
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BroadcastParticipantRequest, BroadcastParticipantResponse> broadcastParticipant = genForbroadcastParticipant();

    private static HttpRequestDef<BroadcastParticipantRequest, BroadcastParticipantResponse> genForbroadcastParticipant() {
        // basic
        HttpRequestDef.Builder<BroadcastParticipantRequest, BroadcastParticipantResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BroadcastParticipantRequest.class, BroadcastParticipantResponse.class)
                .withName("BroadcastParticipant")
                .withUri("/v1/mmc/control/conferences/participants/broadcast")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BroadcastParticipantRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BroadcastParticipantRequest::getParticipantID, (req, v) -> {
                req.setParticipantID(v);
            })
        );
        builder.withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BroadcastParticipantRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CancelMeetingRequest, CancelMeetingResponse> cancelMeeting = genForcancelMeeting();

    private static HttpRequestDef<CancelMeetingRequest, CancelMeetingResponse> genForcancelMeeting() {
        // basic
        HttpRequestDef.Builder<CancelMeetingRequest, CancelMeetingResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, CancelMeetingRequest.class, CancelMeetingResponse.class)
                .withName("CancelMeeting")
                .withUri("/v1/mmc/management/conferences")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CancelMeetingRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CancelMeetingRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            })
        );
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(CancelMeetingRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CancelMeetingRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            })
        );
        builder.withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CancelMeetingRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CheckSlideVerifyCodeRequest, CheckSlideVerifyCodeResponse> checkSlideVerifyCode = genForcheckSlideVerifyCode();

    private static HttpRequestDef<CheckSlideVerifyCodeRequest, CheckSlideVerifyCodeResponse> genForcheckSlideVerifyCode() {
        // basic
        HttpRequestDef.Builder<CheckSlideVerifyCodeRequest, CheckSlideVerifyCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CheckSlideVerifyCodeRequest.class, CheckSlideVerifyCodeResponse.class)
                .withName("CheckSlideVerifyCode")
                .withUri("/v1/usg/acs/auth/slideverifycode/check")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CheckSlideVerifyCodeRequest::getXRequestID, (req, v) -> {
                req.setXRequestID(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CheckSlideVerifyCodeRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SlideVerifyCodeCheckDTO.class,
            f -> f.withMarshaller(CheckSlideVerifyCodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CheckTokenRequest, CheckTokenResponse> checkToken = genForcheckToken();

    private static HttpRequestDef<CheckTokenRequest, CheckTokenResponse> genForcheckToken() {
        // basic
        HttpRequestDef.Builder<CheckTokenRequest, CheckTokenResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckTokenRequest.class, CheckTokenResponse.class)
                .withName("CheckToken")
                .withUri("/v1/usg/acs/token/validate")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CheckTokenRequest::getXRequestID, (req, v) -> {
                req.setXRequestID(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CheckTokenRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ValidateTokenReqDTO.class,
            f -> f.withMarshaller(CheckTokenRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CheckVeriCodeForUpdateUserInfoRequest, CheckVeriCodeForUpdateUserInfoResponse> checkVeriCodeForUpdateUserInfo = genForcheckVeriCodeForUpdateUserInfo();

    private static HttpRequestDef<CheckVeriCodeForUpdateUserInfoRequest, CheckVeriCodeForUpdateUserInfoResponse> genForcheckVeriCodeForUpdateUserInfo() {
        // basic
        HttpRequestDef.Builder<CheckVeriCodeForUpdateUserInfoRequest, CheckVeriCodeForUpdateUserInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckVeriCodeForUpdateUserInfoRequest.class, CheckVeriCodeForUpdateUserInfoResponse.class)
                .withName("CheckVeriCodeForUpdateUserInfo")
                .withUri("/v1/usg/dcs/member/verification-code/verify")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CheckVeriCodeForUpdateUserInfoRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CheckVeriCodeForUpdateUserInfoRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            VerificationCodeDTO.class,
            f -> f.withMarshaller(CheckVeriCodeForUpdateUserInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CheckVerifyCodeRequest, CheckVerifyCodeResponse> checkVerifyCode = genForcheckVerifyCode();

    private static HttpRequestDef<CheckVerifyCodeRequest, CheckVerifyCodeResponse> genForcheckVerifyCode() {
        // basic
        HttpRequestDef.Builder<CheckVerifyCodeRequest, CheckVerifyCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CheckVerifyCodeRequest.class, CheckVerifyCodeResponse.class)
                .withName("CheckVerifyCode")
                .withUri("/v1/usg/acs/verifycode/check")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CheckVerifyCodeRequest::getXRequestID, (req, v) -> {
                req.setXRequestID(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CheckVerifyCodeRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            VerifyCodeCheckDTO.class,
            f -> f.withMarshaller(CheckVerifyCodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateAnonymousAuthRandomRequest, CreateAnonymousAuthRandomResponse> createAnonymousAuthRandom = genForcreateAnonymousAuthRandom();

    private static HttpRequestDef<CreateAnonymousAuthRandomRequest, CreateAnonymousAuthRandomResponse> genForcreateAnonymousAuthRandom() {
        // basic
        HttpRequestDef.Builder<CreateAnonymousAuthRandomRequest, CreateAnonymousAuthRandomResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CreateAnonymousAuthRandomRequest.class, CreateAnonymousAuthRandomResponse.class)
                .withName("CreateAnonymousAuthRandom")
                .withUri("/v1/mmc/management/conferences/anonymous/auth")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateAnonymousAuthRandomRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("X-Password",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateAnonymousAuthRandomRequest::getXPassword, (req, v) -> {
                req.setXPassword(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateConfTokenRequest, CreateConfTokenResponse> createConfToken = genForcreateConfToken();

    private static HttpRequestDef<CreateConfTokenRequest, CreateConfTokenResponse> genForcreateConfToken() {
        // basic
        HttpRequestDef.Builder<CreateConfTokenRequest, CreateConfTokenResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CreateConfTokenRequest.class, CreateConfTokenResponse.class)
                .withName("CreateConfToken")
                .withUri("/v1/mmc/control/conferences/token")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateConfTokenRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateConfTokenRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            })
        );
        builder.withRequestField("X-Password",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateConfTokenRequest::getXPassword, (req, v) -> {
                req.setXPassword(v);
            })
        );
        builder.withRequestField("X-Login-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateConfTokenRequest::getXLoginType, (req, v) -> {
                req.setXLoginType(v);
            })
        );
        builder.withRequestField("X-Nonce",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateConfTokenRequest::getXNonce, (req, v) -> {
                req.setXNonce(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateMeetingRequest, CreateMeetingResponse> createMeeting = genForcreateMeeting();

    private static HttpRequestDef<CreateMeetingRequest, CreateMeetingResponse> genForcreateMeeting() {
        // basic
        HttpRequestDef.Builder<CreateMeetingRequest, CreateMeetingResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMeetingRequest.class, CreateMeetingResponse.class)
                .withName("CreateMeeting")
                .withUri("/v1/mmc/management/conferences")
                .withContentType("application/json");

        // requests
        builder.withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateMeetingRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            })
        );
        builder.withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateMeetingRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            })
        );
        builder.withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateMeetingRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestScheduleConfDTO.class,
            f -> f.withMarshaller(CreateMeetingRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreatePortalRefNonceRequest, CreatePortalRefNonceResponse> createPortalRefNonce = genForcreatePortalRefNonce();

    private static HttpRequestDef<CreatePortalRefNonceRequest, CreatePortalRefNonceResponse> genForcreatePortalRefNonce() {
        // basic
        HttpRequestDef.Builder<CreatePortalRefNonceRequest, CreatePortalRefNonceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePortalRefNonceRequest.class, CreatePortalRefNonceResponse.class)
                .withName("CreatePortalRefNonce")
                .withUri("/v1/usg/acs/auth/portal-ref-nonce")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePortalRefNonceRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePortalRefNonceRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateVisionActiveCodeRequest, CreateVisionActiveCodeResponse> createVisionActiveCode = genForcreateVisionActiveCode();

    private static HttpRequestDef<CreateVisionActiveCodeRequest, CreateVisionActiveCodeResponse> genForcreateVisionActiveCode() {
        // basic
        HttpRequestDef.Builder<CreateVisionActiveCodeRequest, CreateVisionActiveCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVisionActiveCodeRequest.class, CreateVisionActiveCodeResponse.class)
                .withName("CreateVisionActiveCode")
                .withUri("/v1/usg/dcs/corp/vision/activecode")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateVisionActiveCodeRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateVisionActiveCodeRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            VisionActiveCodeDTO.class,
            f -> f.withMarshaller(CreateVisionActiveCodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateWebSocketTokenRequest, CreateWebSocketTokenResponse> createWebSocketToken = genForcreateWebSocketToken();

    private static HttpRequestDef<CreateWebSocketTokenRequest, CreateWebSocketTokenResponse> genForcreateWebSocketToken() {
        // basic
        HttpRequestDef.Builder<CreateWebSocketTokenRequest, CreateWebSocketTokenResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CreateWebSocketTokenRequest.class, CreateWebSocketTokenResponse.class)
                .withName("CreateWebSocketToken")
                .withUri("/v1/mmc/control/conferences/wsToken")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateWebSocketTokenRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateWebSocketTokenRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteAttendeesRequest, DeleteAttendeesResponse> deleteAttendees = genFordeleteAttendees();

    private static HttpRequestDef<DeleteAttendeesRequest, DeleteAttendeesResponse> genFordeleteAttendees() {
        // basic
        HttpRequestDef.Builder<DeleteAttendeesRequest, DeleteAttendeesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteAttendeesRequest.class, DeleteAttendeesResponse.class)
                .withName("DeleteAttendees")
                .withUri("/v1/mmc/control/conferences/attendees/delete")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteAttendeesRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteAttendeesRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestBulkDelAttendReqBody.class,
            f -> f.withMarshaller(DeleteAttendeesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteCorpRequest, DeleteCorpResponse> deleteCorp = genFordeleteCorp();

    private static HttpRequestDef<DeleteCorpRequest, DeleteCorpResponse> genFordeleteCorp() {
        // basic
        HttpRequestDef.Builder<DeleteCorpRequest, DeleteCorpResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCorpRequest.class, DeleteCorpResponse.class)
                .withName("DeleteCorp")
                .withUri("/v1/usg/dcs/sp/corp/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteCorpRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteCorpRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteCorpRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteCorpVmrRequest, DeleteCorpVmrResponse> deleteCorpVmr = genFordeleteCorpVmr();

    private static HttpRequestDef<DeleteCorpVmrRequest, DeleteCorpVmrResponse> genFordeleteCorpVmr() {
        // basic
        HttpRequestDef.Builder<DeleteCorpVmrRequest, DeleteCorpVmrResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteCorpVmrRequest.class, DeleteCorpVmrResponse.class)
                .withName("DeleteCorpVmr")
                .withUri("/v1/usg/dcs/corp/vmr/delete")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteCorpVmrRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteCorpVmrRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(DeleteCorpVmrRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class)
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteDepartmentRequest, DeleteDepartmentResponse> deleteDepartment = genFordeleteDepartment();

    private static HttpRequestDef<DeleteDepartmentRequest, DeleteDepartmentResponse> genFordeleteDepartment() {
        // basic
        HttpRequestDef.Builder<DeleteDepartmentRequest, DeleteDepartmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDepartmentRequest.class, DeleteDepartmentResponse.class)
                .withName("DeleteDepartment")
                .withUri("/v1/usg/dcs/corp/dept/{dept_code}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("dept_code",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDepartmentRequest::getDeptCode, (req, v) -> {
                req.setDeptCode(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDepartmentRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDepartmentRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteRecordingsRequest, DeleteRecordingsResponse> deleteRecordings = genFordeleteRecordings();

    private static HttpRequestDef<DeleteRecordingsRequest, DeleteRecordingsResponse> genFordeleteRecordings() {
        // basic
        HttpRequestDef.Builder<DeleteRecordingsRequest, DeleteRecordingsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRecordingsRequest.class, DeleteRecordingsResponse.class)
                .withName("DeleteRecordings")
                .withUri("/v1/mmc/management/record/files")
                .withContentType("application/json");

        // requests
        builder.withRequestField("confUUIDs",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRecordingsRequest::getConfUUIDs, (req, v) -> {
                req.setConfUUIDs(v);
            })
        );
        builder.withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRecordingsRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            })
        );
        builder.withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRecordingsRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            })
        );
        builder.withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRecordingsRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceRequest, DeleteResourceResponse> deleteResource = genFordeleteResource();

    private static HttpRequestDef<DeleteResourceRequest, DeleteResourceResponse> genFordeleteResource() {
        // basic
        HttpRequestDef.Builder<DeleteResourceRequest, DeleteResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteResourceRequest.class, DeleteResourceResponse.class)
                .withName("DeleteResource")
                .withUri("/v1/usg/dcs/sp/corp/{corp_id}/resource/delete")
                .withContentType("application/json");

        // requests
        builder.withRequestField("corp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteResourceRequest::getCorpId, (req, v) -> {
                req.setCorpId(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteResourceRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteResourceRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(DeleteResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class)
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteVisionActiveCodeRequest, DeleteVisionActiveCodeResponse> deleteVisionActiveCode = genFordeleteVisionActiveCode();

    private static HttpRequestDef<DeleteVisionActiveCodeRequest, DeleteVisionActiveCodeResponse> genFordeleteVisionActiveCode() {
        // basic
        HttpRequestDef.Builder<DeleteVisionActiveCodeRequest, DeleteVisionActiveCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVisionActiveCodeRequest.class, DeleteVisionActiveCodeResponse.class)
                .withName("DeleteVisionActiveCode")
                .withUri("/v1/usg/dcs/corp/vision/activecode")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteVisionActiveCodeRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteVisionActiveCodeRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(DeleteVisionActiveCodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class)
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DisassociateVmrRequest, DisassociateVmrResponse> disassociateVmr = genFordisassociateVmr();

    private static HttpRequestDef<DisassociateVmrRequest, DisassociateVmrResponse> genFordisassociateVmr() {
        // basic
        HttpRequestDef.Builder<DisassociateVmrRequest, DisassociateVmrResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisassociateVmrRequest.class, DisassociateVmrResponse.class)
                .withName("DisassociateVmr")
                .withUri("/v1/usg/dcs/corp/vmr/recycle-from-member/{account}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("account",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisassociateVmrRequest::getAccount, (req, v) -> {
                req.setAccount(v);
            })
        );
        builder.withRequestField("accountType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(DisassociateVmrRequest::getAccountType, (req, v) -> {
                req.setAccountType(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DisassociateVmrRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DisassociateVmrRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(DisassociateVmrRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class)
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<HandRequest, HandResponse> hand = genForhand();

    private static HttpRequestDef<HandRequest, HandResponse> genForhand() {
        // basic
        HttpRequestDef.Builder<HandRequest, HandResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, HandRequest.class, HandResponse.class)
                .withName("Hand")
                .withUri("/v1/mmc/control/conferences/participants/hands")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(HandRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(HandRequest::getParticipantID, (req, v) -> {
                req.setParticipantID(v);
            })
        );
        builder.withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(HandRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestHandsUpReqBody.class,
            f -> f.withMarshaller(HandRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<HangUpRequest, HangUpResponse> hangUp = genForhangUp();

    private static HttpRequestDef<HangUpRequest, HangUpResponse> genForhangUp() {
        // basic
        HttpRequestDef.Builder<HangUpRequest, HangUpResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, HangUpRequest.class, HangUpResponse.class)
                .withName("HangUp")
                .withUri("/v1/mmc/control/conferences/participants/delete")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(HangUpRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(HangUpRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestBulkHangUpReqBody.class,
            f -> f.withMarshaller(HangUpRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<InviteParticipantRequest, InviteParticipantResponse> inviteParticipant = genForinviteParticipant();

    private static HttpRequestDef<InviteParticipantRequest, InviteParticipantResponse> genForinviteParticipant() {
        // basic
        HttpRequestDef.Builder<InviteParticipantRequest, InviteParticipantResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, InviteParticipantRequest.class, InviteParticipantResponse.class)
                .withName("InviteParticipant")
                .withUri("/v1/mmc/control/conferences/participants")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(InviteParticipantRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(InviteParticipantRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestInviteReqBody.class,
            f -> f.withMarshaller(InviteParticipantRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<InviteUserRequest, InviteUserResponse> inviteUser = genForinviteUser();

    private static HttpRequestDef<InviteUserRequest, InviteUserResponse> genForinviteUser() {
        // basic
        HttpRequestDef.Builder<InviteUserRequest, InviteUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, InviteUserRequest.class, InviteUserResponse.class)
                .withName("InviteUser")
                .withUri("/v1/usg/dcs/corp/member/add")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(InviteUserRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(InviteUserRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AddUserRequestBody.class,
            f -> f.withMarshaller(InviteUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<InviteWithPwdRequest, InviteWithPwdResponse> inviteWithPwd = genForinviteWithPwd();

    private static HttpRequestDef<InviteWithPwdRequest, InviteWithPwdResponse> genForinviteWithPwd() {
        // basic
        HttpRequestDef.Builder<InviteWithPwdRequest, InviteWithPwdResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, InviteWithPwdRequest.class, InviteWithPwdResponse.class)
                .withName("InviteWithPwd")
                .withUri("/v1/mmc/control/conferences/inviteWithPwd")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(InviteWithPwdRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestInviteWithPwdReqBody.class,
            f -> f.withMarshaller(InviteWithPwdRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<LiveRequest, LiveResponse> live = genForlive();

    private static HttpRequestDef<LiveRequest, LiveResponse> genForlive() {
        // basic
        HttpRequestDef.Builder<LiveRequest, LiveResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, LiveRequest.class, LiveResponse.class)
                .withName("Live")
                .withUri("/v1/mmc/control/conferences/live")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(LiveRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(LiveRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestSetLiveReqBody.class,
            f -> f.withMarshaller(LiveRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<LockMeetingRequest, LockMeetingResponse> lockMeeting = genForlockMeeting();

    private static HttpRequestDef<LockMeetingRequest, LockMeetingResponse> genForlockMeeting() {
        // basic
        HttpRequestDef.Builder<LockMeetingRequest, LockMeetingResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, LockMeetingRequest.class, LockMeetingResponse.class)
                .withName("LockMeeting")
                .withUri("/v1/mmc/control/conferences/lock")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(LockMeetingRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(LockMeetingRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestLockReqBody.class,
            f -> f.withMarshaller(LockMeetingRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<LockViewRequest, LockViewResponse> lockView = genForlockView();

    private static HttpRequestDef<LockViewRequest, LockViewResponse> genForlockView() {
        // basic
        HttpRequestDef.Builder<LockViewRequest, LockViewResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, LockViewRequest.class, LockViewResponse.class)
                .withName("LockView")
                .withUri("/v1/mmc/control/conferences/lockView")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(LockViewRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(LockViewRequest::getParticipantID, (req, v) -> {
                req.setParticipantID(v);
            })
        );
        builder.withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(LockViewRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestLockSiteViewReqBody.class,
            f -> f.withMarshaller(LockViewRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<MuteMeetingRequest, MuteMeetingResponse> muteMeeting = genFormuteMeeting();

    private static HttpRequestDef<MuteMeetingRequest, MuteMeetingResponse> genFormuteMeeting() {
        // basic
        HttpRequestDef.Builder<MuteMeetingRequest, MuteMeetingResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, MuteMeetingRequest.class, MuteMeetingResponse.class)
                .withName("MuteMeeting")
                .withUri("/v1/mmc/control/conferences/mute")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(MuteMeetingRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(MuteMeetingRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestMuteReqBody.class,
            f -> f.withMarshaller(MuteMeetingRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<MuteParticipantRequest, MuteParticipantResponse> muteParticipant = genFormuteParticipant();

    private static HttpRequestDef<MuteParticipantRequest, MuteParticipantResponse> genFormuteParticipant() {
        // basic
        HttpRequestDef.Builder<MuteParticipantRequest, MuteParticipantResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, MuteParticipantRequest.class, MuteParticipantResponse.class)
                .withName("MuteParticipant")
                .withUri("/v1/mmc/control/conferences/participants/mute")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(MuteParticipantRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(MuteParticipantRequest::getParticipantID, (req, v) -> {
                req.setParticipantID(v);
            })
        );
        builder.withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(MuteParticipantRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestMuteParticipantReqBody.class,
            f -> f.withMarshaller(MuteParticipantRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ProlongMeetingRequest, ProlongMeetingResponse> prolongMeeting = genForprolongMeeting();

    private static HttpRequestDef<ProlongMeetingRequest, ProlongMeetingResponse> genForprolongMeeting() {
        // basic
        HttpRequestDef.Builder<ProlongMeetingRequest, ProlongMeetingResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ProlongMeetingRequest.class, ProlongMeetingResponse.class)
                .withName("ProlongMeeting")
                .withUri("/v1/mmc/control/conferences/duration")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ProlongMeetingRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ProlongMeetingRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestProlongDurReqBody.class,
            f -> f.withMarshaller(ProlongMeetingRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RecordRequest, RecordResponse> record = genForrecord();

    private static HttpRequestDef<RecordRequest, RecordResponse> genForrecord() {
        // basic
        HttpRequestDef.Builder<RecordRequest, RecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RecordRequest.class, RecordResponse.class)
                .withName("Record")
                .withUri("/v1/mmc/control/conferences/record")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RecordRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RecordRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestSetRecordReqBody.class,
            f -> f.withMarshaller(RecordRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RenameParticipantRequest, RenameParticipantResponse> renameParticipant = genForrenameParticipant();

    private static HttpRequestDef<RenameParticipantRequest, RenameParticipantResponse> genForrenameParticipant() {
        // basic
        HttpRequestDef.Builder<RenameParticipantRequest, RenameParticipantResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RenameParticipantRequest.class, RenameParticipantResponse.class)
                .withName("RenameParticipant")
                .withUri("/v1/mmc/control/conferences/participants/name")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RenameParticipantRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RenameParticipantRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestRenamePartReqBody.class,
            f -> f.withMarshaller(RenameParticipantRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ResetActivecodeRequest, ResetActivecodeResponse> resetActivecode = genForresetActivecode();

    private static HttpRequestDef<ResetActivecodeRequest, ResetActivecodeResponse> genForresetActivecode() {
        // basic
        HttpRequestDef.Builder<ResetActivecodeRequest, ResetActivecodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetActivecodeRequest.class, ResetActivecodeResponse.class)
                .withName("ResetActivecode")
                .withUri("/v1/usg/dcs/corp/device/{sn}/activecode")
                .withContentType("application/json");

        // requests
        builder.withRequestField("sn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResetActivecodeRequest::getSn, (req, v) -> {
                req.setSn(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ResetActivecodeRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ResetActivecodeRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ActiveDTO.class,
            f -> f.withMarshaller(ResetActivecodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ResetPwdRequest, ResetPwdResponse> resetPwd = genForresetPwd();

    private static HttpRequestDef<ResetPwdRequest, ResetPwdResponse> genForresetPwd() {
        // basic
        HttpRequestDef.Builder<ResetPwdRequest, ResetPwdResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResetPwdRequest.class, ResetPwdResponse.class)
                .withName("ResetPwd")
                .withUri("/v1/usg/acs/password/reset")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ResetPwdRequest::getXRequestID, (req, v) -> {
                req.setXRequestID(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ResetPwdRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ResetPwdReqDTOV1.class,
            f -> f.withMarshaller(ResetPwdRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ResetPwdByAdminRequest, ResetPwdByAdminResponse> resetPwdByAdmin = genForresetPwdByAdmin();

    private static HttpRequestDef<ResetPwdByAdminRequest, ResetPwdByAdminResponse> genForresetPwdByAdmin() {
        // basic
        HttpRequestDef.Builder<ResetPwdByAdminRequest, ResetPwdByAdminResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResetPwdByAdminRequest.class, ResetPwdByAdminResponse.class)
                .withName("ResetPwdByAdmin")
                .withUri("/v1/usg/acs/password/admin/reset")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ResetPwdByAdminRequest::getXRequestID, (req, v) -> {
                req.setXRequestID(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ResetPwdByAdminRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AdminResetPwdReqDTO.class,
            f -> f.withMarshaller(ResetPwdByAdminRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ResetVisionActiveCodeRequest, ResetVisionActiveCodeResponse> resetVisionActiveCode = genForresetVisionActiveCode();

    private static HttpRequestDef<ResetVisionActiveCodeRequest, ResetVisionActiveCodeResponse> genForresetVisionActiveCode() {
        // basic
        HttpRequestDef.Builder<ResetVisionActiveCodeRequest, ResetVisionActiveCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResetVisionActiveCodeRequest.class, ResetVisionActiveCodeResponse.class)
                .withName("ResetVisionActiveCode")
                .withUri("/v1/usg/dcs/corp/vision/activecode/{account}/reset")
                .withContentType("application/json");

        // requests
        builder.withRequestField("account",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResetVisionActiveCodeRequest::getAccount, (req, v) -> {
                req.setAccount(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ResetVisionActiveCodeRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ResetVisionActiveCodeRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ActiveDTO.class,
            f -> f.withMarshaller(ResetVisionActiveCodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RollcallParticipantRequest, RollcallParticipantResponse> rollcallParticipant = genForrollcallParticipant();

    private static HttpRequestDef<RollcallParticipantRequest, RollcallParticipantResponse> genForrollcallParticipant() {
        // basic
        HttpRequestDef.Builder<RollcallParticipantRequest, RollcallParticipantResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RollcallParticipantRequest.class, RollcallParticipantResponse.class)
                .withName("RollcallParticipant")
                .withUri("/v1/mmc/control/conferences/participants/rollCall")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RollcallParticipantRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RollcallParticipantRequest::getParticipantID, (req, v) -> {
                req.setParticipantID(v);
            })
        );
        builder.withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RollcallParticipantRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SearchAttendanceRecordsOfHisMeetingRequest, SearchAttendanceRecordsOfHisMeetingResponse> searchAttendanceRecordsOfHisMeeting = genForsearchAttendanceRecordsOfHisMeeting();

    private static HttpRequestDef<SearchAttendanceRecordsOfHisMeetingRequest, SearchAttendanceRecordsOfHisMeetingResponse> genForsearchAttendanceRecordsOfHisMeeting() {
        // basic
        HttpRequestDef.Builder<SearchAttendanceRecordsOfHisMeetingRequest, SearchAttendanceRecordsOfHisMeetingResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchAttendanceRecordsOfHisMeetingRequest.class, SearchAttendanceRecordsOfHisMeetingResponse.class)
                .withName("SearchAttendanceRecordsOfHisMeeting")
                .withUri("/v1/mmc/management/conferences/history/confAttendeeRecord")
                .withContentType("application/json");

        // requests
        builder.withRequestField("confUUID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SearchAttendanceRecordsOfHisMeetingRequest::getConfUUID, (req, v) -> {
                req.setConfUUID(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchAttendanceRecordsOfHisMeetingRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchAttendanceRecordsOfHisMeetingRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchAttendanceRecordsOfHisMeetingRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            })
        );
        builder.withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchAttendanceRecordsOfHisMeetingRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            })
        );
        builder.withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchAttendanceRecordsOfHisMeetingRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            })
        );
        builder.withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchAttendanceRecordsOfHisMeetingRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchAttendanceRecordsOfHisMeetingRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SearchCorpRequest, SearchCorpResponse> searchCorp = genForsearchCorp();

    private static HttpRequestDef<SearchCorpRequest, SearchCorpResponse> genForsearchCorp() {
        // basic
        HttpRequestDef.Builder<SearchCorpRequest, SearchCorpResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchCorpRequest.class, SearchCorpResponse.class)
                .withName("SearchCorp")
                .withUri("/v1/usg/dcs/sp/corp")
                .withContentType("application/json");

        // requests
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchCorpRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchCorpRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchCorpRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchCorpRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchCorpRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SearchCorpAdminsRequest, SearchCorpAdminsResponse> searchCorpAdmins = genForsearchCorpAdmins();

    private static HttpRequestDef<SearchCorpAdminsRequest, SearchCorpAdminsResponse> genForsearchCorpAdmins() {
        // basic
        HttpRequestDef.Builder<SearchCorpAdminsRequest, SearchCorpAdminsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchCorpAdminsRequest.class, SearchCorpAdminsResponse.class)
                .withName("SearchCorpAdmins")
                .withUri("/v1/usg/dcs/corp/admin")
                .withContentType("application/json");

        // requests
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchCorpAdminsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchCorpAdminsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchCorpAdminsRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchCorpAdminsRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchCorpAdminsRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SearchCorpDirRequest, SearchCorpDirResponse> searchCorpDir = genForsearchCorpDir();

    private static HttpRequestDef<SearchCorpDirRequest, SearchCorpDirResponse> genForsearchCorpDir() {
        // basic
        HttpRequestDef.Builder<SearchCorpDirRequest, SearchCorpDirResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchCorpDirRequest.class, SearchCorpDirResponse.class)
                .withName("SearchCorpDir")
                .withUri("/v1/usg/abs/users")
                .withContentType("application/json");

        // requests
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchCorpDirRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchCorpDirRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchCorpDirRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            })
        );
        builder.withRequestField("deptCode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchCorpDirRequest::getDeptCode, (req, v) -> {
                req.setDeptCode(v);
            })
        );
        builder.withRequestField("querySubDept",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(SearchCorpDirRequest::getQuerySubDept, (req, v) -> {
                req.setQuerySubDept(v);
            })
        );
        builder.withRequestField("searchScope",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchCorpDirRequest::getSearchScope, (req, v) -> {
                req.setSearchScope(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchCorpDirRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchCorpDirRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SearchCorpVmrRequest, SearchCorpVmrResponse> searchCorpVmr = genForsearchCorpVmr();

    private static HttpRequestDef<SearchCorpVmrRequest, SearchCorpVmrResponse> genForsearchCorpVmr() {
        // basic
        HttpRequestDef.Builder<SearchCorpVmrRequest, SearchCorpVmrResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchCorpVmrRequest.class, SearchCorpVmrResponse.class)
                .withName("SearchCorpVmr")
                .withUri("/v1/usg/dcs/corp/vmr")
                .withContentType("application/json");

        // requests
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchCorpVmrRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchCorpVmrRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchCorpVmrRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchCorpVmrRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchCorpVmrRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchCorpVmrRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SearchCtlRecordsOfHisMeetingRequest, SearchCtlRecordsOfHisMeetingResponse> searchCtlRecordsOfHisMeeting = genForsearchCtlRecordsOfHisMeeting();

    private static HttpRequestDef<SearchCtlRecordsOfHisMeetingRequest, SearchCtlRecordsOfHisMeetingResponse> genForsearchCtlRecordsOfHisMeeting() {
        // basic
        HttpRequestDef.Builder<SearchCtlRecordsOfHisMeetingRequest, SearchCtlRecordsOfHisMeetingResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchCtlRecordsOfHisMeetingRequest.class, SearchCtlRecordsOfHisMeetingResponse.class)
                .withName("SearchCtlRecordsOfHisMeeting")
                .withUri("/v1/mmc/management/conferences/history/confCtlRecord")
                .withContentType("application/json");

        // requests
        builder.withRequestField("confUUID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SearchCtlRecordsOfHisMeetingRequest::getConfUUID, (req, v) -> {
                req.setConfUUID(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchCtlRecordsOfHisMeetingRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchCtlRecordsOfHisMeetingRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchCtlRecordsOfHisMeetingRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            })
        );
        builder.withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchCtlRecordsOfHisMeetingRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            })
        );
        builder.withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchCtlRecordsOfHisMeetingRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchCtlRecordsOfHisMeetingRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SearchDepartmentByNameRequest, SearchDepartmentByNameResponse> searchDepartmentByName = genForsearchDepartmentByName();

    private static HttpRequestDef<SearchDepartmentByNameRequest, SearchDepartmentByNameResponse> genForsearchDepartmentByName() {
        // basic
        HttpRequestDef.Builder<SearchDepartmentByNameRequest, SearchDepartmentByNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchDepartmentByNameRequest.class, SearchDepartmentByNameResponse.class)
                .withName("SearchDepartmentByName")
                .withUri("/v1/usg/dcs/member/dept")
                .withContentType("application/json");

        // requests
        builder.withRequestField("deptName",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SearchDepartmentByNameRequest::getDeptName, (req, v) -> {
                req.setDeptName(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchDepartmentByNameRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchDepartmentByNameRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(SearchDepartmentByNameResponse::getBody, (response, data)->{
                response.setBody(data);
            }).withInnerContainerType(QueryDeptResultDTO.class)
        );


        return builder.build();
    }

    public static final HttpRequestDef<SearchDevicesRequest, SearchDevicesResponse> searchDevices = genForsearchDevices();

    private static HttpRequestDef<SearchDevicesRequest, SearchDevicesResponse> genForsearchDevices() {
        // basic
        HttpRequestDef.Builder<SearchDevicesRequest, SearchDevicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchDevicesRequest.class, SearchDevicesResponse.class)
                .withName("SearchDevices")
                .withUri("/v1/usg/dcs/corp/device")
                .withContentType("application/json");

        // requests
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchDevicesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchDevicesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchDevicesRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            })
        );
        builder.withRequestField("model",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchDevicesRequest::getModel, (req, v) -> {
                req.setModel(v);
            })
        );
        builder.withRequestField("deptCode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchDevicesRequest::getDeptCode, (req, v) -> {
                req.setDeptCode(v);
            })
        );
        builder.withRequestField("enableSubDept",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(SearchDevicesRequest::getEnableSubDept, (req, v) -> {
                req.setEnableSubDept(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchDevicesRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchDevicesRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SearchHisMeetingsRequest, SearchHisMeetingsResponse> searchHisMeetings = genForsearchHisMeetings();

    private static HttpRequestDef<SearchHisMeetingsRequest, SearchHisMeetingsResponse> genForsearchHisMeetings() {
        // basic
        HttpRequestDef.Builder<SearchHisMeetingsRequest, SearchHisMeetingsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchHisMeetingsRequest.class, SearchHisMeetingsResponse.class)
                .withName("SearchHisMeetings")
                .withUri("/v1/mmc/management/conferences/history")
                .withContentType("application/json");

        // requests
        builder.withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchHisMeetingsRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchHisMeetingsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchHisMeetingsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchHisMeetingsRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            })
        );
        builder.withRequestField("queryAll",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(SearchHisMeetingsRequest::getQueryAll, (req, v) -> {
                req.setQueryAll(v);
            })
        );
        builder.withRequestField("startDate",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(SearchHisMeetingsRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            })
        );
        builder.withRequestField("endDate",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(SearchHisMeetingsRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            })
        );
        builder.withRequestField("sortType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchHisMeetingsRequest::getSortType, (req, v) -> {
                req.setSortType(v);
            })
        );
        builder.withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchHisMeetingsRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            })
        );
        builder.withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchHisMeetingsRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SearchMaterialsRequest, SearchMaterialsResponse> searchMaterials = genForsearchMaterials();

    private static HttpRequestDef<SearchMaterialsRequest, SearchMaterialsResponse> genForsearchMaterials() {
        // basic
        HttpRequestDef.Builder<SearchMaterialsRequest, SearchMaterialsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchMaterialsRequest.class, SearchMaterialsResponse.class)
                .withName("SearchMaterials")
                .withUri("/v1/usg/sss/materials")
                .withContentType("application/json");

        // requests
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchMaterialsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchMaterialsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchMaterialsRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchMaterialsRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchMaterialsRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SearchMeetingFileListRequest, SearchMeetingFileListResponse> searchMeetingFileList = genForsearchMeetingFileList();

    private static HttpRequestDef<SearchMeetingFileListRequest, SearchMeetingFileListResponse> genForsearchMeetingFileList() {
        // basic
        HttpRequestDef.Builder<SearchMeetingFileListRequest, SearchMeetingFileListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchMeetingFileListRequest.class, SearchMeetingFileListResponse.class)
                .withName("SearchMeetingFileList")
                .withUri("/v1/usg/sss/meeting-files")
                .withContentType("application/json");

        // requests
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchMeetingFileListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchMeetingFileListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchMeetingFileListRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchMeetingFileListRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchMeetingFileListRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SearchMeetingsRequest, SearchMeetingsResponse> searchMeetings = genForsearchMeetings();

    private static HttpRequestDef<SearchMeetingsRequest, SearchMeetingsResponse> genForsearchMeetings() {
        // basic
        HttpRequestDef.Builder<SearchMeetingsRequest, SearchMeetingsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchMeetingsRequest.class, SearchMeetingsResponse.class)
                .withName("SearchMeetings")
                .withUri("/v1/mmc/management/conferences")
                .withContentType("application/json");

        // requests
        builder.withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchMeetingsRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchMeetingsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchMeetingsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("queryAll",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(SearchMeetingsRequest::getQueryAll, (req, v) -> {
                req.setQueryAll(v);
            })
        );
        builder.withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchMeetingsRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            })
        );
        builder.withRequestField("queryConfMode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchMeetingsRequest::getQueryConfMode, (req, v) -> {
                req.setQueryConfMode(v);
            })
        );
        builder.withRequestField("sortType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchMeetingsRequest::getSortType, (req, v) -> {
                req.setSortType(v);
            })
        );
        builder.withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchMeetingsRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            })
        );
        builder.withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchMeetingsRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SearchMemberVmrRequest, SearchMemberVmrResponse> searchMemberVmr = genForsearchMemberVmr();

    private static HttpRequestDef<SearchMemberVmrRequest, SearchMemberVmrResponse> genForsearchMemberVmr() {
        // basic
        HttpRequestDef.Builder<SearchMemberVmrRequest, SearchMemberVmrResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchMemberVmrRequest.class, SearchMemberVmrResponse.class)
                .withName("SearchMemberVmr")
                .withUri("/v1/usg/dcs/member/vmr")
                .withContentType("application/json");

        // requests
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchMemberVmrRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchMemberVmrRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchMemberVmrRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            })
        );
        builder.withRequestField("specialVmr",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(SearchMemberVmrRequest::getSpecialVmr, (req, v) -> {
                req.setSpecialVmr(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchMemberVmrRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchMemberVmrRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SearchMemberVmrByCloudLinkRequest, SearchMemberVmrByCloudLinkResponse> searchMemberVmrByCloudLink = genForsearchMemberVmrByCloudLink();

    private static HttpRequestDef<SearchMemberVmrByCloudLinkRequest, SearchMemberVmrByCloudLinkResponse> genForsearchMemberVmrByCloudLink() {
        // basic
        HttpRequestDef.Builder<SearchMemberVmrByCloudLinkRequest, SearchMemberVmrByCloudLinkResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchMemberVmrByCloudLinkRequest.class, SearchMemberVmrByCloudLinkResponse.class)
                .withName("SearchMemberVmrByCloudLink")
                .withUri("/v1/usg/dcs/member/vmrinfo")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchMemberVmrByCloudLinkRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchMemberVmrByCloudLinkRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SearchOnlineMeetingsRequest, SearchOnlineMeetingsResponse> searchOnlineMeetings = genForsearchOnlineMeetings();

    private static HttpRequestDef<SearchOnlineMeetingsRequest, SearchOnlineMeetingsResponse> genForsearchOnlineMeetings() {
        // basic
        HttpRequestDef.Builder<SearchOnlineMeetingsRequest, SearchOnlineMeetingsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchOnlineMeetingsRequest.class, SearchOnlineMeetingsResponse.class)
                .withName("SearchOnlineMeetings")
                .withUri("/v1/mmc/management/conferences/online")
                .withContentType("application/json");

        // requests
        builder.withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchOnlineMeetingsRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchOnlineMeetingsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchOnlineMeetingsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("queryAll",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(SearchOnlineMeetingsRequest::getQueryAll, (req, v) -> {
                req.setQueryAll(v);
            })
        );
        builder.withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchOnlineMeetingsRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            })
        );
        builder.withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchOnlineMeetingsRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            })
        );
        builder.withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchOnlineMeetingsRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SearchProgramsRequest, SearchProgramsResponse> searchPrograms = genForsearchPrograms();

    private static HttpRequestDef<SearchProgramsRequest, SearchProgramsResponse> genForsearchPrograms() {
        // basic
        HttpRequestDef.Builder<SearchProgramsRequest, SearchProgramsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchProgramsRequest.class, SearchProgramsResponse.class)
                .withName("SearchPrograms")
                .withUri("/v1/usg/sss/programs")
                .withContentType("application/json");

        // requests
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchProgramsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchProgramsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchProgramsRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchProgramsRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchProgramsRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SearchPublicationsRequest, SearchPublicationsResponse> searchPublications = genForsearchPublications();

    private static HttpRequestDef<SearchPublicationsRequest, SearchPublicationsResponse> genForsearchPublications() {
        // basic
        HttpRequestDef.Builder<SearchPublicationsRequest, SearchPublicationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchPublicationsRequest.class, SearchPublicationsResponse.class)
                .withName("SearchPublications")
                .withUri("/v1/usg/sss/publications")
                .withContentType("application/json");

        // requests
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchPublicationsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchPublicationsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchPublicationsRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchPublicationsRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchPublicationsRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SearchRecordingsRequest, SearchRecordingsResponse> searchRecordings = genForsearchRecordings();

    private static HttpRequestDef<SearchRecordingsRequest, SearchRecordingsResponse> genForsearchRecordings() {
        // basic
        HttpRequestDef.Builder<SearchRecordingsRequest, SearchRecordingsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchRecordingsRequest.class, SearchRecordingsResponse.class)
                .withName("SearchRecordings")
                .withUri("/v1/mmc/management/record/files")
                .withContentType("application/json");

        // requests
        builder.withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchRecordingsRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchRecordingsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchRecordingsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("queryAll",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(SearchRecordingsRequest::getQueryAll, (req, v) -> {
                req.setQueryAll(v);
            })
        );
        builder.withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchRecordingsRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            })
        );
        builder.withRequestField("startDate",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(SearchRecordingsRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            })
        );
        builder.withRequestField("endDate",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(SearchRecordingsRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            })
        );
        builder.withRequestField("sortType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchRecordingsRequest::getSortType, (req, v) -> {
                req.setSortType(v);
            })
        );
        builder.withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchRecordingsRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            })
        );
        builder.withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchRecordingsRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SearchResourceRequest, SearchResourceResponse> searchResource = genForsearchResource();

    private static HttpRequestDef<SearchResourceRequest, SearchResourceResponse> genForsearchResource() {
        // basic
        HttpRequestDef.Builder<SearchResourceRequest, SearchResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchResourceRequest.class, SearchResourceResponse.class)
                .withName("SearchResource")
                .withUri("/v1/usg/dcs/sp/corp/{corp_id}/resource")
                .withContentType("application/json");

        // requests
        builder.withRequestField("corp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SearchResourceRequest::getCorpId, (req, v) -> {
                req.setCorpId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchResourceRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchResourceRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchResourceRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            })
        );
        builder.withRequestField("startExpireDate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(SearchResourceRequest::getStartExpireDate, (req, v) -> {
                req.setStartExpireDate(v);
            })
        );
        builder.withRequestField("endExpireDate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(SearchResourceRequest::getEndExpireDate, (req, v) -> {
                req.setEndExpireDate(v);
            })
        );
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchResourceRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.withRequestField("typeId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchResourceRequest::getTypeId, (req, v) -> {
                req.setTypeId(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchResourceRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchResourceRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchResourceRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SearchResourceOpRecordRequest, SearchResourceOpRecordResponse> searchResourceOpRecord = genForsearchResourceOpRecord();

    private static HttpRequestDef<SearchResourceOpRecordRequest, SearchResourceOpRecordResponse> genForsearchResourceOpRecord() {
        // basic
        HttpRequestDef.Builder<SearchResourceOpRecordRequest, SearchResourceOpRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchResourceOpRecordRequest.class, SearchResourceOpRecordResponse.class)
                .withName("SearchResourceOpRecord")
                .withUri("/v1/usg/dcs/sp/corp/{corp_id}/resource-record")
                .withContentType("application/json");

        // requests
        builder.withRequestField("corp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getCorpId, (req, v) -> {
                req.setCorpId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            })
        );
        builder.withRequestField("startExpireDate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getStartExpireDate, (req, v) -> {
                req.setStartExpireDate(v);
            })
        );
        builder.withRequestField("endExpireDate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getEndExpireDate, (req, v) -> {
                req.setEndExpireDate(v);
            })
        );
        builder.withRequestField("startOperateDate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getStartOperateDate, (req, v) -> {
                req.setStartOperateDate(v);
            })
        );
        builder.withRequestField("endOperateDate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getEndOperateDate, (req, v) -> {
                req.setEndOperateDate(v);
            })
        );
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.withRequestField("typeId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getTypeId, (req, v) -> {
                req.setTypeId(v);
            })
        );
        builder.withRequestField("operateType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getOperateType, (req, v) -> {
                req.setOperateType(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SearchUsersRequest, SearchUsersResponse> searchUsers = genForsearchUsers();

    private static HttpRequestDef<SearchUsersRequest, SearchUsersResponse> genForsearchUsers() {
        // basic
        HttpRequestDef.Builder<SearchUsersRequest, SearchUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchUsersRequest.class, SearchUsersResponse.class)
                .withName("SearchUsers")
                .withUri("/v1/usg/dcs/corp/member")
                .withContentType("application/json");

        // requests
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchUsersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchUsersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchUsersRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            })
        );
        builder.withRequestField("sortField",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchUsersRequest::getSortField, (req, v) -> {
                req.setSortField(v);
            })
        );
        builder.withRequestField("isAsc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(SearchUsersRequest::getIsAsc, (req, v) -> {
                req.setIsAsc(v);
            })
        );
        builder.withRequestField("deptCode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchUsersRequest::getDeptCode, (req, v) -> {
                req.setDeptCode(v);
            })
        );
        builder.withRequestField("enableSubDept",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(SearchUsersRequest::getEnableSubDept, (req, v) -> {
                req.setEnableSubDept(v);
            })
        );
        builder.withRequestField("adminType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            SearchUsersRequest.AdminTypeEnum.class,
            f -> f.withMarshaller(SearchUsersRequest::getAdminType, (req, v) -> {
                req.setAdminType(v);
            })
        );
        builder.withRequestField("enableRoom",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(SearchUsersRequest::getEnableRoom, (req, v) -> {
                req.setEnableRoom(v);
            })
        );
        builder.withRequestField("userType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(SearchUsersRequest::getUserType, (req, v) -> {
                req.setUserType(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchUsersRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("containsUnActive",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(SearchUsersRequest::getContainsUnActive, (req, v) -> {
                req.setContainsUnActive(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchUsersRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchUsersRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SearchVisionActiveCodeRequest, SearchVisionActiveCodeResponse> searchVisionActiveCode = genForsearchVisionActiveCode();

    private static HttpRequestDef<SearchVisionActiveCodeRequest, SearchVisionActiveCodeResponse> genForsearchVisionActiveCode() {
        // basic
        HttpRequestDef.Builder<SearchVisionActiveCodeRequest, SearchVisionActiveCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchVisionActiveCodeRequest.class, SearchVisionActiveCodeResponse.class)
                .withName("SearchVisionActiveCode")
                .withUri("/v1/usg/dcs/corp/vision/activecode")
                .withContentType("application/json");

        // requests
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchVisionActiveCodeRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchVisionActiveCodeRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchVisionActiveCodeRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            })
        );
        builder.withRequestField("devType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchVisionActiveCodeRequest::getDevType, (req, v) -> {
                req.setDevType(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchVisionActiveCodeRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchVisionActiveCodeRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SendSlideVerifyCodeRequest, SendSlideVerifyCodeResponse> sendSlideVerifyCode = genForsendSlideVerifyCode();

    private static HttpRequestDef<SendSlideVerifyCodeRequest, SendSlideVerifyCodeResponse> genForsendSlideVerifyCode() {
        // basic
        HttpRequestDef.Builder<SendSlideVerifyCodeRequest, SendSlideVerifyCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SendSlideVerifyCodeRequest.class, SendSlideVerifyCodeResponse.class)
                .withName("SendSlideVerifyCode")
                .withUri("/v1/usg/acs/auth/slideverifycode/send")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SendSlideVerifyCodeRequest::getXRequestID, (req, v) -> {
                req.setXRequestID(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SendSlideVerifyCodeRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SlideVerifyCodeSendDTO.class,
            f -> f.withMarshaller(SendSlideVerifyCodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SendVeriCodeForChangePwdRequest, SendVeriCodeForChangePwdResponse> sendVeriCodeForChangePwd = genForsendVeriCodeForChangePwd();

    private static HttpRequestDef<SendVeriCodeForChangePwdRequest, SendVeriCodeForChangePwdResponse> genForsendVeriCodeForChangePwd() {
        // basic
        HttpRequestDef.Builder<SendVeriCodeForChangePwdRequest, SendVeriCodeForChangePwdResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SendVeriCodeForChangePwdRequest.class, SendVeriCodeForChangePwdResponse.class)
                .withName("SendVeriCodeForChangePwd")
                .withUri("/v1/usg/acs/verifycode/send")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SendVeriCodeForChangePwdRequest::getXRequestID, (req, v) -> {
                req.setXRequestID(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SendVeriCodeForChangePwdRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            VerifyCodeSendDTOV1.class,
            f -> f.withMarshaller(SendVeriCodeForChangePwdRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SendVeriCodeForUpdateUserInfoRequest, SendVeriCodeForUpdateUserInfoResponse> sendVeriCodeForUpdateUserInfo = genForsendVeriCodeForUpdateUserInfo();

    private static HttpRequestDef<SendVeriCodeForUpdateUserInfoRequest, SendVeriCodeForUpdateUserInfoResponse> genForsendVeriCodeForUpdateUserInfo() {
        // basic
        HttpRequestDef.Builder<SendVeriCodeForUpdateUserInfoRequest, SendVeriCodeForUpdateUserInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SendVeriCodeForUpdateUserInfoRequest.class, SendVeriCodeForUpdateUserInfoResponse.class)
                .withName("SendVeriCodeForUpdateUserInfo")
                .withUri("/v1/usg/dcs/member/verification-code")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SendVeriCodeForUpdateUserInfoRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SendVeriCodeForUpdateUserInfoRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            VerificationCodeDTO.class,
            f -> f.withMarshaller(SendVeriCodeForUpdateUserInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SetCustomMultiPictureRequest, SetCustomMultiPictureResponse> setCustomMultiPicture = genForsetCustomMultiPicture();

    private static HttpRequestDef<SetCustomMultiPictureRequest, SetCustomMultiPictureResponse> genForsetCustomMultiPicture() {
        // basic
        HttpRequestDef.Builder<SetCustomMultiPictureRequest, SetCustomMultiPictureResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetCustomMultiPictureRequest.class, SetCustomMultiPictureResponse.class)
                .withName("SetCustomMultiPicture")
                .withUri("/v1/mmc/control/conferences/display/")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SetCustomMultiPictureRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SetCustomMultiPictureRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            RestCustomMultiPictureBody.class,
            f -> f.withMarshaller(SetCustomMultiPictureRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SetHostViewRequest, SetHostViewResponse> setHostView = genForsetHostView();

    private static HttpRequestDef<SetHostViewRequest, SetHostViewResponse> genForsetHostView() {
        // basic
        HttpRequestDef.Builder<SetHostViewRequest, SetHostViewResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetHostViewRequest.class, SetHostViewResponse.class)
                .withName("SetHostView")
                .withUri("/v1/mmc/control/conferences/chairView")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SetHostViewRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SetHostViewRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestChairViewReqBody.class,
            f -> f.withMarshaller(SetHostViewRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SetMultiPictureRequest, SetMultiPictureResponse> setMultiPicture = genForsetMultiPicture();

    private static HttpRequestDef<SetMultiPictureRequest, SetMultiPictureResponse> genForsetMultiPicture() {
        // basic
        HttpRequestDef.Builder<SetMultiPictureRequest, SetMultiPictureResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetMultiPictureRequest.class, SetMultiPictureResponse.class)
                .withName("SetMultiPicture")
                .withUri("/v1/mmc/control/conferences/display/multiPicture")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SetMultiPictureRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SetMultiPictureRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestMixedPictureBody.class,
            f -> f.withMarshaller(SetMultiPictureRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SetParticipantViewRequest, SetParticipantViewResponse> setParticipantView = genForsetParticipantView();

    private static HttpRequestDef<SetParticipantViewRequest, SetParticipantViewResponse> genForsetParticipantView() {
        // basic
        HttpRequestDef.Builder<SetParticipantViewRequest, SetParticipantViewResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetParticipantViewRequest.class, SetParticipantViewResponse.class)
                .withName("SetParticipantView")
                .withUri("/v1/mmc/control/conferences/partView")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SetParticipantViewRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SetParticipantViewRequest::getParticipantID, (req, v) -> {
                req.setParticipantID(v);
            })
        );
        builder.withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SetParticipantViewRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestParticipantViewReqBody.class,
            f -> f.withMarshaller(SetParticipantViewRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SetRoleRequest, SetRoleResponse> setRole = genForsetRole();

    private static HttpRequestDef<SetRoleRequest, SetRoleResponse> genForsetRole() {
        // basic
        HttpRequestDef.Builder<SetRoleRequest, SetRoleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetRoleRequest.class, SetRoleResponse.class)
                .withName("SetRole")
                .withUri("/v1/mmc/control/conferences/participants/role")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SetRoleRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SetRoleRequest::getParticipantID, (req, v) -> {
                req.setParticipantID(v);
            })
        );
        builder.withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SetRoleRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestChairTokenReqBody.class,
            f -> f.withMarshaller(SetRoleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowConfOrgRequest, ShowConfOrgResponse> showConfOrg = genForshowConfOrg();

    private static HttpRequestDef<ShowConfOrgRequest, ShowConfOrgResponse> genForshowConfOrg() {
        // basic
        HttpRequestDef.Builder<ShowConfOrgRequest, ShowConfOrgResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConfOrgRequest.class, ShowConfOrgResponse.class)
                .withName("ShowConfOrg")
                .withUri("/v1/mmc/management/conferences/confOrg")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowConfOrgRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowCorpRequest, ShowCorpResponse> showCorp = genForshowCorp();

    private static HttpRequestDef<ShowCorpRequest, ShowCorpResponse> genForshowCorp() {
        // basic
        HttpRequestDef.Builder<ShowCorpRequest, ShowCorpResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCorpRequest.class, ShowCorpResponse.class)
                .withName("ShowCorp")
                .withUri("/v1/usg/dcs/sp/corp/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCorpRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCorpRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCorpRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowCorpAdminRequest, ShowCorpAdminResponse> showCorpAdmin = genForshowCorpAdmin();

    private static HttpRequestDef<ShowCorpAdminRequest, ShowCorpAdminResponse> genForshowCorpAdmin() {
        // basic
        HttpRequestDef.Builder<ShowCorpAdminRequest, ShowCorpAdminResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCorpAdminRequest.class, ShowCorpAdminResponse.class)
                .withName("ShowCorpAdmin")
                .withUri("/v1/usg/dcs/corp/admin/{account}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("account",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCorpAdminRequest::getAccount, (req, v) -> {
                req.setAccount(v);
            })
        );
        builder.withRequestField("accountType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowCorpAdminRequest::getAccountType, (req, v) -> {
                req.setAccountType(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCorpAdminRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCorpAdminRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowCorpBasicInfoRequest, ShowCorpBasicInfoResponse> showCorpBasicInfo = genForshowCorpBasicInfo();

    private static HttpRequestDef<ShowCorpBasicInfoRequest, ShowCorpBasicInfoResponse> genForshowCorpBasicInfo() {
        // basic
        HttpRequestDef.Builder<ShowCorpBasicInfoRequest, ShowCorpBasicInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCorpBasicInfoRequest.class, ShowCorpBasicInfoResponse.class)
                .withName("ShowCorpBasicInfo")
                .withUri("/v1/usg/dcs/corp")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCorpBasicInfoRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCorpBasicInfoRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowCorpResourceRequest, ShowCorpResourceResponse> showCorpResource = genForshowCorpResource();

    private static HttpRequestDef<ShowCorpResourceRequest, ShowCorpResourceResponse> genForshowCorpResource() {
        // basic
        HttpRequestDef.Builder<ShowCorpResourceRequest, ShowCorpResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCorpResourceRequest.class, ShowCorpResourceResponse.class)
                .withName("ShowCorpResource")
                .withUri("/v1/usg/dcs/corp/resource")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCorpResourceRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCorpResourceRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowDeptAndChildDeptRequest, ShowDeptAndChildDeptResponse> showDeptAndChildDept = genForshowDeptAndChildDept();

    private static HttpRequestDef<ShowDeptAndChildDeptRequest, ShowDeptAndChildDeptResponse> genForshowDeptAndChildDept() {
        // basic
        HttpRequestDef.Builder<ShowDeptAndChildDeptRequest, ShowDeptAndChildDeptResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeptAndChildDeptRequest.class, ShowDeptAndChildDeptResponse.class)
                .withName("ShowDeptAndChildDept")
                .withUri("/v1/usg/dcs/member/dept/{dept_code}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("dept_code",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDeptAndChildDeptRequest::getDeptCode, (req, v) -> {
                req.setDeptCode(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDeptAndChildDeptRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDeptAndChildDeptRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceDetailRequest, ShowDeviceDetailResponse> showDeviceDetail = genForshowDeviceDetail();

    private static HttpRequestDef<ShowDeviceDetailRequest, ShowDeviceDetailResponse> genForshowDeviceDetail() {
        // basic
        HttpRequestDef.Builder<ShowDeviceDetailRequest, ShowDeviceDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeviceDetailRequest.class, ShowDeviceDetailResponse.class)
                .withName("ShowDeviceDetail")
                .withUri("/v1/usg/dcs/corp/device/{sn}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("sn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDeviceDetailRequest::getSn, (req, v) -> {
                req.setSn(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDeviceDetailRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDeviceDetailRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceStatusRequest, ShowDeviceStatusResponse> showDeviceStatus = genForshowDeviceStatus();

    private static HttpRequestDef<ShowDeviceStatusRequest, ShowDeviceStatusResponse> genForshowDeviceStatus() {
        // basic
        HttpRequestDef.Builder<ShowDeviceStatusRequest, ShowDeviceStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowDeviceStatusRequest.class, ShowDeviceStatusResponse.class)
                .withName("ShowDeviceStatus")
                .withUri("/v1/usg/acs/ap/userstatus")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDeviceStatusRequest::getXRequestID, (req, v) -> {
                req.setXRequestID(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDeviceStatusRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(ShowDeviceStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class)
        );

        // response
        
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ShowDeviceStatusResponse::getBody, (response, data)->{
                response.setBody(data);
            }).withInnerContainerType(UserStatusDTO.class)
        );


        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceTypesRequest, ShowDeviceTypesResponse> showDeviceTypes = genForshowDeviceTypes();

    private static HttpRequestDef<ShowDeviceTypesRequest, ShowDeviceTypesResponse> genForshowDeviceTypes() {
        // basic
        HttpRequestDef.Builder<ShowDeviceTypesRequest, ShowDeviceTypesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeviceTypesRequest.class, ShowDeviceTypesResponse.class)
                .withName("ShowDeviceTypes")
                .withUri("/v1/usg/dcs/termdevtype")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDeviceTypesRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDeviceTypesRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ShowDeviceTypesResponse::getBody, (response, data)->{
                response.setBody(data);
            }).withInnerContainerType(QueryDeviceTypeResultDTO.class)
        );


        return builder.build();
    }

    public static final HttpRequestDef<ShowHisMeetingDetailRequest, ShowHisMeetingDetailResponse> showHisMeetingDetail = genForshowHisMeetingDetail();

    private static HttpRequestDef<ShowHisMeetingDetailRequest, ShowHisMeetingDetailResponse> genForshowHisMeetingDetail() {
        // basic
        HttpRequestDef.Builder<ShowHisMeetingDetailRequest, ShowHisMeetingDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHisMeetingDetailRequest.class, ShowHisMeetingDetailResponse.class)
                .withName("ShowHisMeetingDetail")
                .withUri("/v1/mmc/management/conferences/history/confDetail")
                .withContentType("application/json");

        // requests
        builder.withRequestField("confUUID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowHisMeetingDetailRequest::getConfUUID, (req, v) -> {
                req.setConfUUID(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowHisMeetingDetailRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowHisMeetingDetailRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowHisMeetingDetailRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            })
        );
        builder.withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowHisMeetingDetailRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            })
        );
        builder.withRequestField("X-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowHisMeetingDetailRequest::getXType, (req, v) -> {
                req.setXType(v);
            })
        );
        builder.withRequestField("X-Query-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowHisMeetingDetailRequest::getXQueryType, (req, v) -> {
                req.setXQueryType(v);
            })
        );
        builder.withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowHisMeetingDetailRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            })
        );
        builder.withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowHisMeetingDetailRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowMeetingDetailRequest, ShowMeetingDetailResponse> showMeetingDetail = genForshowMeetingDetail();

    private static HttpRequestDef<ShowMeetingDetailRequest, ShowMeetingDetailResponse> genForshowMeetingDetail() {
        // basic
        HttpRequestDef.Builder<ShowMeetingDetailRequest, ShowMeetingDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMeetingDetailRequest.class, ShowMeetingDetailResponse.class)
                .withName("ShowMeetingDetail")
                .withUri("/v1/mmc/management/conferences/confDetail")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowMeetingDetailRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowMeetingDetailRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowMeetingDetailRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMeetingDetailRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            })
        );
        builder.withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMeetingDetailRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            })
        );
        builder.withRequestField("X-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMeetingDetailRequest::getXType, (req, v) -> {
                req.setXType(v);
            })
        );
        builder.withRequestField("X-Query-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMeetingDetailRequest::getXQueryType, (req, v) -> {
                req.setXQueryType(v);
            })
        );
        builder.withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMeetingDetailRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            })
        );
        builder.withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMeetingDetailRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowMeetingFileRequest, ShowMeetingFileResponse> showMeetingFile = genForshowMeetingFile();

    private static HttpRequestDef<ShowMeetingFileRequest, ShowMeetingFileResponse> genForshowMeetingFile() {
        // basic
        HttpRequestDef.Builder<ShowMeetingFileRequest, ShowMeetingFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMeetingFileRequest.class, ShowMeetingFileResponse.class)
                .withName("ShowMeetingFile")
                .withUri("/v1/usg/sss/meeting-files/{file_code}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("file_code",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowMeetingFileRequest::getFileCode, (req, v) -> {
                req.setFileCode(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMeetingFileRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMeetingFileRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowMeetingFileListRequest, ShowMeetingFileListResponse> showMeetingFileList = genForshowMeetingFileList();

    private static HttpRequestDef<ShowMeetingFileListRequest, ShowMeetingFileListResponse> genForshowMeetingFileList() {
        // basic
        HttpRequestDef.Builder<ShowMeetingFileListRequest, ShowMeetingFileListResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowMeetingFileListRequest.class, ShowMeetingFileListResponse.class)
                .withName("ShowMeetingFileList")
                .withUri("/v1/usg/sss/meeting-files/open-meeting-file-list")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMeetingFileListRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMeetingFileListRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            Map.class,
            f -> f.withMarshaller(ShowMeetingFileListRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class)
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowMyInfoRequest, ShowMyInfoResponse> showMyInfo = genForshowMyInfo();

    private static HttpRequestDef<ShowMyInfoRequest, ShowMyInfoResponse> genForshowMyInfo() {
        // basic
        HttpRequestDef.Builder<ShowMyInfoRequest, ShowMyInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMyInfoRequest.class, ShowMyInfoResponse.class)
                .withName("ShowMyInfo")
                .withUri("/v1/usg/dcs/member")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMyInfoRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMyInfoRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowOnlineMeetingDetailRequest, ShowOnlineMeetingDetailResponse> showOnlineMeetingDetail = genForshowOnlineMeetingDetail();

    private static HttpRequestDef<ShowOnlineMeetingDetailRequest, ShowOnlineMeetingDetailResponse> genForshowOnlineMeetingDetail() {
        // basic
        HttpRequestDef.Builder<ShowOnlineMeetingDetailRequest, ShowOnlineMeetingDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOnlineMeetingDetailRequest.class, ShowOnlineMeetingDetailResponse.class)
                .withName("ShowOnlineMeetingDetail")
                .withUri("/v1/mmc/management/conferences/online/confDetail")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowOnlineMeetingDetailRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowOnlineMeetingDetailRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowOnlineMeetingDetailRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowOnlineMeetingDetailRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            })
        );
        builder.withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowOnlineMeetingDetailRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            })
        );
        builder.withRequestField("X-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowOnlineMeetingDetailRequest::getXType, (req, v) -> {
                req.setXType(v);
            })
        );
        builder.withRequestField("X-Query-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowOnlineMeetingDetailRequest::getXQueryType, (req, v) -> {
                req.setXQueryType(v);
            })
        );
        builder.withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowOnlineMeetingDetailRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            })
        );
        builder.withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowOnlineMeetingDetailRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowOrgResRequest, ShowOrgResResponse> showOrgRes = genForshowOrgRes();

    private static HttpRequestDef<ShowOrgResRequest, ShowOrgResResponse> genForshowOrgRes() {
        // basic
        HttpRequestDef.Builder<ShowOrgResRequest, ShowOrgResResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOrgResRequest.class, ShowOrgResResponse.class)
                .withName("ShowOrgRes")
                .withUri("/v1/mmc/management/orgRes")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowProgramRequest, ShowProgramResponse> showProgram = genForshowProgram();

    private static HttpRequestDef<ShowProgramRequest, ShowProgramResponse> genForshowProgram() {
        // basic
        HttpRequestDef.Builder<ShowProgramRequest, ShowProgramResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProgramRequest.class, ShowProgramResponse.class)
                .withName("ShowProgram")
                .withUri("/v1/usg/sss/programs/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowProgramRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowProgramRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowProgramRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowPublicationRequest, ShowPublicationResponse> showPublication = genForshowPublication();

    private static HttpRequestDef<ShowPublicationRequest, ShowPublicationResponse> genForshowPublication() {
        // basic
        HttpRequestDef.Builder<ShowPublicationRequest, ShowPublicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPublicationRequest.class, ShowPublicationResponse.class)
                .withName("ShowPublication")
                .withUri("/v1/usg/sss/publications/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowPublicationRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPublicationRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPublicationRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowRealTimeInfoOfMeetingRequest, ShowRealTimeInfoOfMeetingResponse> showRealTimeInfoOfMeeting = genForshowRealTimeInfoOfMeeting();

    private static HttpRequestDef<ShowRealTimeInfoOfMeetingRequest, ShowRealTimeInfoOfMeetingResponse> genForshowRealTimeInfoOfMeeting() {
        // basic
        HttpRequestDef.Builder<ShowRealTimeInfoOfMeetingRequest, ShowRealTimeInfoOfMeetingResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRealTimeInfoOfMeetingRequest.class, ShowRealTimeInfoOfMeetingResponse.class)
                .withName("ShowRealTimeInfoOfMeeting")
                .withUri("/v1/mmc/control/conferences/realTimeInfo")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowRealTimeInfoOfMeetingRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowRealTimeInfoOfMeetingRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordingDetailRequest, ShowRecordingDetailResponse> showRecordingDetail = genForshowRecordingDetail();

    private static HttpRequestDef<ShowRecordingDetailRequest, ShowRecordingDetailResponse> genForshowRecordingDetail() {
        // basic
        HttpRequestDef.Builder<ShowRecordingDetailRequest, ShowRecordingDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRecordingDetailRequest.class, ShowRecordingDetailResponse.class)
                .withName("ShowRecordingDetail")
                .withUri("/v1/mmc/management/conferences/record/files")
                .withContentType("application/json");

        // requests
        builder.withRequestField("confUUID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowRecordingDetailRequest::getConfUUID, (req, v) -> {
                req.setConfUUID(v);
            })
        );
        builder.withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowRecordingDetailRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            })
        );
        builder.withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowRecordingDetailRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            })
        );
        builder.withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowRecordingDetailRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordingFileDownloadUrlsRequest, ShowRecordingFileDownloadUrlsResponse> showRecordingFileDownloadUrls = genForshowRecordingFileDownloadUrls();

    private static HttpRequestDef<ShowRecordingFileDownloadUrlsRequest, ShowRecordingFileDownloadUrlsResponse> genForshowRecordingFileDownloadUrls() {
        // basic
        HttpRequestDef.Builder<ShowRecordingFileDownloadUrlsRequest, ShowRecordingFileDownloadUrlsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRecordingFileDownloadUrlsRequest.class, ShowRecordingFileDownloadUrlsResponse.class)
                .withName("ShowRecordingFileDownloadUrls")
                .withUri("/v1/mmc/management/record/downloadurls")
                .withContentType("application/json");

        // requests
        builder.withRequestField("confUUID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowRecordingFileDownloadUrlsRequest::getConfUUID, (req, v) -> {
                req.setConfUUID(v);
            })
        );
        builder.withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowRecordingFileDownloadUrlsRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            })
        );
        builder.withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowRecordingFileDownloadUrlsRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowRegionInfoOfMeetingRequest, ShowRegionInfoOfMeetingResponse> showRegionInfoOfMeeting = genForshowRegionInfoOfMeeting();

    private static HttpRequestDef<ShowRegionInfoOfMeetingRequest, ShowRegionInfoOfMeetingResponse> genForshowRegionInfoOfMeeting() {
        // basic
        HttpRequestDef.Builder<ShowRegionInfoOfMeetingRequest, ShowRegionInfoOfMeetingResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRegionInfoOfMeetingRequest.class, ShowRegionInfoOfMeetingResponse.class)
                .withName("ShowRegionInfoOfMeeting")
                .withUri("/v1/mmc/management/conferences/region/info")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowRegionInfoOfMeetingRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowSpResRequest, ShowSpResResponse> showSpRes = genForshowSpRes();

    private static HttpRequestDef<ShowSpResRequest, ShowSpResResponse> genForshowSpRes() {
        // basic
        HttpRequestDef.Builder<ShowSpResRequest, ShowSpResResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSpResRequest.class, ShowSpResResponse.class)
                .withName("ShowSpRes")
                .withUri("/v1/mmc/management/spRes")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowSpResourceRequest, ShowSpResourceResponse> showSpResource = genForshowSpResource();

    private static HttpRequestDef<ShowSpResourceRequest, ShowSpResourceResponse> genForshowSpResource() {
        // basic
        HttpRequestDef.Builder<ShowSpResourceRequest, ShowSpResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSpResourceRequest.class, ShowSpResourceResponse.class)
                .withName("ShowSpResource")
                .withUri("/v1/usg/dcs/sp/resource")
                .withContentType("application/json");

        // requests
        builder.withRequestField("queryGroup",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ShowSpResourceRequest::getQueryGroup, (req, v) -> {
                req.setQueryGroup(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowSpResourceRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowSpResourceRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowUserDetailRequest, ShowUserDetailResponse> showUserDetail = genForshowUserDetail();

    private static HttpRequestDef<ShowUserDetailRequest, ShowUserDetailResponse> genForshowUserDetail() {
        // basic
        HttpRequestDef.Builder<ShowUserDetailRequest, ShowUserDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserDetailRequest.class, ShowUserDetailResponse.class)
                .withName("ShowUserDetail")
                .withUri("/v1/usg/dcs/corp/member/{account}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("account",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowUserDetailRequest::getAccount, (req, v) -> {
                req.setAccount(v);
            })
        );
        builder.withRequestField("accountType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowUserDetailRequest::getAccountType, (req, v) -> {
                req.setAccountType(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowUserDetailRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowUserDetailRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<StopMeetingRequest, StopMeetingResponse> stopMeeting = genForstopMeeting();

    private static HttpRequestDef<StopMeetingRequest, StopMeetingResponse> genForstopMeeting() {
        // basic
        HttpRequestDef.Builder<StopMeetingRequest, StopMeetingResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, StopMeetingRequest.class, StopMeetingResponse.class)
                .withName("StopMeeting")
                .withUri("/v1/mmc/control/conferences/stop")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(StopMeetingRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(StopMeetingRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SwitchModeRequest, SwitchModeResponse> switchMode = genForswitchMode();

    private static HttpRequestDef<SwitchModeRequest, SwitchModeResponse> genForswitchMode() {
        // basic
        HttpRequestDef.Builder<SwitchModeRequest, SwitchModeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SwitchModeRequest.class, SwitchModeResponse.class)
                .withName("SwitchMode")
                .withUri("/v1/mmc/control/conferences/display/mode")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SwitchModeRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SwitchModeRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestSwitchModeReqBody.class,
            f -> f.withMarshaller(SwitchModeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateContactRequest, UpdateContactResponse> updateContact = genForupdateContact();

    private static HttpRequestDef<UpdateContactRequest, UpdateContactResponse> genForupdateContact() {
        // basic
        HttpRequestDef.Builder<UpdateContactRequest, UpdateContactResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateContactRequest.class, UpdateContactResponse.class)
                .withName("UpdateContact")
                .withUri("/v1/usg/dcs/member/contact")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateContactRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateContactRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            VerificationCodeDTO.class,
            f -> f.withMarshaller(UpdateContactRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateCorpRequest, UpdateCorpResponse> updateCorp = genForupdateCorp();

    private static HttpRequestDef<UpdateCorpRequest, UpdateCorpResponse> genForupdateCorp() {
        // basic
        HttpRequestDef.Builder<UpdateCorpRequest, UpdateCorpResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCorpRequest.class, UpdateCorpResponse.class)
                .withName("UpdateCorp")
                .withUri("/v1/usg/dcs/sp/corp/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateCorpRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateCorpRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateCorpRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ModCorpDTO.class,
            f -> f.withMarshaller(UpdateCorpRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateCorpBasicInfoRequest, UpdateCorpBasicInfoResponse> updateCorpBasicInfo = genForupdateCorpBasicInfo();

    private static HttpRequestDef<UpdateCorpBasicInfoRequest, UpdateCorpBasicInfoResponse> genForupdateCorpBasicInfo() {
        // basic
        HttpRequestDef.Builder<UpdateCorpBasicInfoRequest, UpdateCorpBasicInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCorpBasicInfoRequest.class, UpdateCorpBasicInfoResponse.class)
                .withName("UpdateCorpBasicInfo")
                .withUri("/v1/usg/dcs/corp")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateCorpBasicInfoRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateCorpBasicInfoRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ModCorpBasicInfoDTO.class,
            f -> f.withMarshaller(UpdateCorpBasicInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateDepartmentRequest, UpdateDepartmentResponse> updateDepartment = genForupdateDepartment();

    private static HttpRequestDef<UpdateDepartmentRequest, UpdateDepartmentResponse> genForupdateDepartment() {
        // basic
        HttpRequestDef.Builder<UpdateDepartmentRequest, UpdateDepartmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDepartmentRequest.class, UpdateDepartmentResponse.class)
                .withName("UpdateDepartment")
                .withUri("/v1/usg/dcs/corp/dept/{dept_code}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("dept_code",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDepartmentRequest::getDeptCode, (req, v) -> {
                req.setDeptCode(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateDepartmentRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateDepartmentRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ModDeptDTO.class,
            f -> f.withMarshaller(UpdateDepartmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeviceRequest, UpdateDeviceResponse> updateDevice = genForupdateDevice();

    private static HttpRequestDef<UpdateDeviceRequest, UpdateDeviceResponse> genForupdateDevice() {
        // basic
        HttpRequestDef.Builder<UpdateDeviceRequest, UpdateDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDeviceRequest.class, UpdateDeviceResponse.class)
                .withName("UpdateDevice")
                .withUri("/v1/usg/dcs/corp/device/{sn}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("sn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDeviceRequest::getSn, (req, v) -> {
                req.setSn(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateDeviceRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateDeviceRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ModDeviceDTO.class,
            f -> f.withMarshaller(UpdateDeviceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateMaterialRequest, UpdateMaterialResponse> updateMaterial = genForupdateMaterial();

    private static HttpRequestDef<UpdateMaterialRequest, UpdateMaterialResponse> genForupdateMaterial() {
        // basic
        HttpRequestDef.Builder<UpdateMaterialRequest, UpdateMaterialResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMaterialRequest.class, UpdateMaterialResponse.class)
                .withName("UpdateMaterial")
                .withUri("/v1/usg/sss/materials/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateMaterialRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateMaterialRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateMaterialRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateMaterialRequestDTO.class,
            f -> f.withMarshaller(UpdateMaterialRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateMeetingRequest, UpdateMeetingResponse> updateMeeting = genForupdateMeeting();

    private static HttpRequestDef<UpdateMeetingRequest, UpdateMeetingResponse> genForupdateMeeting() {
        // basic
        HttpRequestDef.Builder<UpdateMeetingRequest, UpdateMeetingResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMeetingRequest.class, UpdateMeetingResponse.class)
                .withName("UpdateMeeting")
                .withUri("/v1/mmc/management/conferences")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateMeetingRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateMeetingRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            })
        );
        builder.withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateMeetingRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            })
        );
        builder.withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateMeetingRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestScheduleConfDTO.class,
            f -> f.withMarshaller(UpdateMeetingRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateMemberVmrRequest, UpdateMemberVmrResponse> updateMemberVmr = genForupdateMemberVmr();

    private static HttpRequestDef<UpdateMemberVmrRequest, UpdateMemberVmrResponse> genForupdateMemberVmr() {
        // basic
        HttpRequestDef.Builder<UpdateMemberVmrRequest, UpdateMemberVmrResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMemberVmrRequest.class, UpdateMemberVmrResponse.class)
                .withName("UpdateMemberVmr")
                .withUri("/v1/usg/dcs/member/vmr/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateMemberVmrRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateMemberVmrRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateMemberVmrRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ModVmrDTO.class,
            f -> f.withMarshaller(UpdateMemberVmrRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateMyInfoRequest, UpdateMyInfoResponse> updateMyInfo = genForupdateMyInfo();

    private static HttpRequestDef<UpdateMyInfoRequest, UpdateMyInfoResponse> genForupdateMyInfo() {
        // basic
        HttpRequestDef.Builder<UpdateMyInfoRequest, UpdateMyInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMyInfoRequest.class, UpdateMyInfoResponse.class)
                .withName("UpdateMyInfo")
                .withUri("/v1/usg/dcs/member")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateMyInfoRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateMyInfoRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ModMemberDTO.class,
            f -> f.withMarshaller(UpdateMyInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateProgramRequest, UpdateProgramResponse> updateProgram = genForupdateProgram();

    private static HttpRequestDef<UpdateProgramRequest, UpdateProgramResponse> genForupdateProgram() {
        // basic
        HttpRequestDef.Builder<UpdateProgramRequest, UpdateProgramResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateProgramRequest.class, UpdateProgramResponse.class)
                .withName("UpdateProgram")
                .withUri("/v1/usg/sss/programs/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateProgramRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateProgramRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateProgramRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateProgramRequestDTO.class,
            f -> f.withMarshaller(UpdateProgramRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdatePublicationRequest, UpdatePublicationResponse> updatePublication = genForupdatePublication();

    private static HttpRequestDef<UpdatePublicationRequest, UpdatePublicationResponse> genForupdatePublication() {
        // basic
        HttpRequestDef.Builder<UpdatePublicationRequest, UpdatePublicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePublicationRequest.class, UpdatePublicationResponse.class)
                .withName("UpdatePublication")
                .withUri("/v1/usg/sss/publications/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdatePublicationRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePublicationRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePublicationRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdatePublicationRequestDTO.class,
            f -> f.withMarshaller(UpdatePublicationRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdatePwdRequest, UpdatePwdResponse> updatePwd = genForupdatePwd();

    private static HttpRequestDef<UpdatePwdRequest, UpdatePwdResponse> genForupdatePwd() {
        // basic
        HttpRequestDef.Builder<UpdatePwdRequest, UpdatePwdResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePwdRequest.class, UpdatePwdResponse.class)
                .withName("UpdatePwd")
                .withUri("/v1/usg/acs/password")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePwdRequest::getXRequestID, (req, v) -> {
                req.setXRequestID(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePwdRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ModPwdReqDTO.class,
            f -> f.withMarshaller(UpdatePwdRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateResourceRequest, UpdateResourceResponse> updateResource = genForupdateResource();

    private static HttpRequestDef<UpdateResourceRequest, UpdateResourceResponse> genForupdateResource() {
        // basic
        HttpRequestDef.Builder<UpdateResourceRequest, UpdateResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateResourceRequest.class, UpdateResourceResponse.class)
                .withName("UpdateResource")
                .withUri("/v1/usg/dcs/sp/corp/{corp_id}/resource")
                .withContentType("application/json");

        // requests
        builder.withRequestField("corp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateResourceRequest::getCorpId, (req, v) -> {
                req.setCorpId(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateResourceRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateResourceRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(UpdateResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(ModResourceDTO.class)
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateStartedConfConfigRequest, UpdateStartedConfConfigResponse> updateStartedConfConfig = genForupdateStartedConfConfig();

    private static HttpRequestDef<UpdateStartedConfConfigRequest, UpdateStartedConfConfigResponse> genForupdateStartedConfConfig() {
        // basic
        HttpRequestDef.Builder<UpdateStartedConfConfigRequest, UpdateStartedConfConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateStartedConfConfigRequest.class, UpdateStartedConfConfigResponse.class)
                .withName("UpdateStartedConfConfig")
                .withUri("/v1/mmc/control/conferences/updateStartedConfConfig")
                .withContentType("application/json");

        // requests
        builder.withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateStartedConfConfigRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            })
        );
        builder.withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateStartedConfConfigRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateStartedConfigReqBody.class,
            f -> f.withMarshaller(UpdateStartedConfConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateTokenRequest, UpdateTokenResponse> updateToken = genForupdateToken();

    private static HttpRequestDef<UpdateTokenRequest, UpdateTokenResponse> genForupdateToken() {
        // basic
        HttpRequestDef.Builder<UpdateTokenRequest, UpdateTokenResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTokenRequest.class, UpdateTokenResponse.class)
                .withName("UpdateToken")
                .withUri("/v1/usg/acs/token")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Request-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateTokenRequest::getXRequestID, (req, v) -> {
                req.setXRequestID(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateTokenRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserRequest, UpdateUserResponse> updateUser = genForupdateUser();

    private static HttpRequestDef<UpdateUserRequest, UpdateUserResponse> genForupdateUser() {
        // basic
        HttpRequestDef.Builder<UpdateUserRequest, UpdateUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateUserRequest.class, UpdateUserResponse.class)
                .withName("UpdateUser")
                .withUri("/v1/usg/dcs/corp/member/{account}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("account",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateUserRequest::getAccount, (req, v) -> {
                req.setAccount(v);
            })
        );
        builder.withRequestField("accountType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(UpdateUserRequest::getAccountType, (req, v) -> {
                req.setAccountType(v);
            })
        );
        builder.withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateUserRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            })
        );
        builder.withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateUserRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ModUserDTO.class,
            f -> f.withMarshaller(UpdateUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SearchQosHistoryMeetingsRequest, SearchQosHistoryMeetingsResponse> searchQosHistoryMeetings = genForsearchQosHistoryMeetings();

    private static HttpRequestDef<SearchQosHistoryMeetingsRequest, SearchQosHistoryMeetingsResponse> genForsearchQosHistoryMeetings() {
        // basic
        HttpRequestDef.Builder<SearchQosHistoryMeetingsRequest, SearchQosHistoryMeetingsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchQosHistoryMeetingsRequest.class, SearchQosHistoryMeetingsResponse.class)
                .withName("SearchQosHistoryMeetings")
                .withUri("/v1/metrics/conferences/history")
                .withContentType("application/json");

        // requests
        builder.withRequestField("startDate",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(SearchQosHistoryMeetingsRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            })
        );
        builder.withRequestField("endDate",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(SearchQosHistoryMeetingsRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchQosHistoryMeetingsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchQosHistoryMeetingsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchQosHistoryMeetingsRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SearchQosOnlineMeetingsRequest, SearchQosOnlineMeetingsResponse> searchQosOnlineMeetings = genForsearchQosOnlineMeetings();

    private static HttpRequestDef<SearchQosOnlineMeetingsRequest, SearchQosOnlineMeetingsResponse> genForsearchQosOnlineMeetings() {
        // basic
        HttpRequestDef.Builder<SearchQosOnlineMeetingsRequest, SearchQosOnlineMeetingsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchQosOnlineMeetingsRequest.class, SearchQosOnlineMeetingsResponse.class)
                .withName("SearchQosOnlineMeetings")
                .withUri("/v1/metrics/conferences/online")
                .withContentType("application/json");

        // requests
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchQosOnlineMeetingsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchQosOnlineMeetingsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchQosOnlineMeetingsRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SearchQosParticipantDetailRequest, SearchQosParticipantDetailResponse> searchQosParticipantDetail = genForsearchQosParticipantDetail();

    private static HttpRequestDef<SearchQosParticipantDetailRequest, SearchQosParticipantDetailResponse> genForsearchQosParticipantDetail() {
        // basic
        HttpRequestDef.Builder<SearchQosParticipantDetailRequest, SearchQosParticipantDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchQosParticipantDetailRequest.class, SearchQosParticipantDetailResponse.class)
                .withName("SearchQosParticipantDetail")
                .withUri("/v1/metrics/conference/participant/qos")
                .withContentType("application/json");

        // requests
        builder.withRequestField("confUUID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SearchQosParticipantDetailRequest::getConfUUID, (req, v) -> {
                req.setConfUUID(v);
            })
        );
        builder.withRequestField("confType",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            SearchQosParticipantDetailRequest.ConfTypeEnum.class,
            f -> f.withMarshaller(SearchQosParticipantDetailRequest::getConfType, (req, v) -> {
                req.setConfType(v);
            })
        );
        builder.withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SearchQosParticipantDetailRequest::getParticipantID, (req, v) -> {
                req.setParticipantID(v);
            })
        );
        builder.withRequestField("qosType",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            SearchQosParticipantDetailRequest.QosTypeEnum.class,
            f -> f.withMarshaller(SearchQosParticipantDetailRequest::getQosType, (req, v) -> {
                req.setQosType(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SearchQosParticipantsRequest, SearchQosParticipantsResponse> searchQosParticipants = genForsearchQosParticipants();

    private static HttpRequestDef<SearchQosParticipantsRequest, SearchQosParticipantsResponse> genForsearchQosParticipants() {
        // basic
        HttpRequestDef.Builder<SearchQosParticipantsRequest, SearchQosParticipantsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchQosParticipantsRequest.class, SearchQosParticipantsResponse.class)
                .withName("SearchQosParticipants")
                .withUri("/v1/metrics/conference/participants")
                .withContentType("application/json");

        // requests
        builder.withRequestField("confUUID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SearchQosParticipantsRequest::getConfUUID, (req, v) -> {
                req.setConfUUID(v);
            })
        );
        builder.withRequestField("confType",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            SearchQosParticipantsRequest.ConfTypeEnum.class,
            f -> f.withMarshaller(SearchQosParticipantsRequest::getConfType, (req, v) -> {
                req.setConfType(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchQosParticipantsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(SearchQosParticipantsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchQosParticipantsRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            })
        );

        // response
        


        return builder.build();
    }

}
