/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.core.auth;

import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.exception.ConnectionTimeoutException;
import com.huaweicloud.sdk.core.exception.HostUnreachableException;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.exception.ServiceResponseException;
import com.huaweicloud.sdk.core.http.HttpClient;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.http.HttpResponse;
import com.huaweicloud.sdk.core.internal.model.CreateTemporaryAccessKeyInEcsResponse;
import com.huaweicloud.sdk.core.internal.model.Credential;
import com.huaweicloud.sdk.core.utils.ExceptionUtils;
import com.huaweicloud.sdk.core.utils.JsonUtils;
import com.huaweicloud.sdk.core.utils.StringUtils;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Objects;

public class TempCredentialHelper {
    private static final String HOST = "169.254.169.254";

    private static final String PATH = "/openstack/latest/securitykey";

    private static final int PORT = 80;

    private static final int TIME_OUT = 3000;

    private static final String ERROR_MESSAGE = "Unable to get temporary credential.";

    private static final String EXPIRED_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    private static final HttpRequest CREATE_TEMPORARY_ACCESS_KEY_IN_CES_REQUEST =
            HttpRequest.newBuilder()
                    .withEndpoint(Constants.HTTP_SCHEME + "://" + HOST)
                    .withPath(PATH)
                    .withMethod(HttpMethod.GET)
                    .withContentType(Constants.MEDIATYPE.APPLICATION_JSON)
                    .build();

    private TempCredentialHelper() {

    }

    private static ICredential loadCredential(HttpClient httpClient, String defaultType) {
        tryConnect();

        Credential credential = getTemporaryCredential(httpClient);

        if (Constants.Credentials.BASIC_CREDENTIAL.equals(defaultType)) {
            BasicCredentials cred = new BasicCredentials();
            updateCredential(cred, credential);

            return cred;

        } else if (Constants.Credentials.GLOBAL_CREDENTIAL.equals(defaultType)) {
            GlobalCredentials cred = new GlobalCredentials();
            updateCredential(cred, credential);

            return cred;
        }

        return null;
    }

    public static ICredential processCredential(HttpClient httpClient, String defaultType, ICredential cred) {
        if (Objects.isNull(cred)) {
            return loadCredential(httpClient, defaultType);
        }

        if (cred instanceof AbstractCredentials
                && StringUtils.isEmpty(((AbstractCredentials<?>) cred).getAk())) {
            updateCredential(
                    (AbstractCredentials<? extends AbstractCredentials<?>>) cred,
                    getTemporaryCredential(httpClient));
        }

        return cred;
    }

    protected static Credential getTemporaryCredential(HttpClient httpClient) {
        HttpResponse httpResponse = httpClient.syncInvokeHttp(CREATE_TEMPORARY_ACCESS_KEY_IN_CES_REQUEST);

        if (httpResponse.getStatusCode() != Constants.StatusCode.SUCCESS) {
            throw ServiceResponseException.mapException(
                    httpResponse.getStatusCode(), ExceptionUtils.extractErrorMessage(httpResponse));
        }

        CreateTemporaryAccessKeyInEcsResponse response =
                JsonUtils.toObject(httpResponse.getBodyAsString(), CreateTemporaryAccessKeyInEcsResponse.class);

        if (Objects.isNull(response) || Objects.isNull(response.getCredential())) {
            throw new SdkException(ERROR_MESSAGE);
        }

        return response.getCredential();
    }

    protected static void updateCredential(
            AbstractCredentials<? extends AbstractCredentials<?>> cred, Credential credential) {
        cred.setAk(credential.getAccess());
        cred.setSk(credential.getSecret());
        cred.setSecurityToken(credential.getSecuritytoken());

        try {
            String expiredAt = credential.getExpiresAt().replace("000Z", "Z");
            cred.expiredAt = new SimpleDateFormat(EXPIRED_DATE_FORMAT).parse(expiredAt).getTime();
        } catch (ParseException e) {
            throw new SdkException(ERROR_MESSAGE, e);
        }
    }

    private static void tryConnect() {
        InetAddress ad;
        try {
            ad = InetAddress.getByName(HOST);
        } catch (UnknownHostException e) {
            throw new SdkException(ERROR_MESSAGE, e);
        }

        try {
            if (!ad.isReachable(TIME_OUT)) {
                throw new IOException();
            }
        } catch (IOException e) {
            throw new HostUnreachableException(ERROR_MESSAGE, e);
        }

        try (Socket socket = new Socket()) {
            SocketAddress address = new InetSocketAddress(HOST, PORT);
            socket.connect(address, TIME_OUT);
        } catch (IOException e) {
            throw new ConnectionTimeoutException(ERROR_MESSAGE, e);
        }
    }
}
