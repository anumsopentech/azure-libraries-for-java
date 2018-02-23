/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import com.microsoft.azure.management.resources.fluentcore.collection.InnerSupportsDelete;
import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ServerAzureADAdministrators.
 */
public class ServerAzureADAdministratorsInner implements InnerSupportsDelete<ServerAzureADAdministratorInner> {
    /** The Retrofit service to perform REST calls. */
    private ServerAzureADAdministratorsService service;
    /** The service client containing this operation class. */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of ServerAzureADAdministratorsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ServerAzureADAdministratorsInner(Retrofit retrofit, SqlManagementClientImpl client) {
        this.service = retrofit.create(ServerAzureADAdministratorsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ServerAzureADAdministrators to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ServerAzureADAdministratorsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.ServerAzureADAdministrators createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/administrators/{administratorName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("administratorName") String administratorName, @Query("api-version") String apiVersion, @Body ServerAzureADAdministratorInner properties, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.ServerAzureADAdministrators beginCreateOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/administrators/{administratorName}")
        Observable<Response<ResponseBody>> beginCreateOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("administratorName") String administratorName, @Query("api-version") String apiVersion, @Body ServerAzureADAdministratorInner properties, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.ServerAzureADAdministrators delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/administrators/{administratorName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("administratorName") String administratorName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.ServerAzureADAdministrators beginDelete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/administrators/{administratorName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> beginDelete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("administratorName") String administratorName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.ServerAzureADAdministrators get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/administrators/{administratorName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("administratorName") String administratorName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.ServerAzureADAdministrators listByServer" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/administrators")
        Observable<Response<ResponseBody>> listByServer(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Creates a new Server Active Directory Administrator or updates an existing server Active Directory Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param properties The required parameters for creating or updating an Active Directory Administrator.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerAzureADAdministratorInner object if successful.
     */
    public ServerAzureADAdministratorInner createOrUpdate(String resourceGroupName, String serverName, ServerAzureADAdministratorInner properties) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, properties).toBlocking().last().body();
    }

    /**
     * Creates a new Server Active Directory Administrator or updates an existing server Active Directory Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param properties The required parameters for creating or updating an Active Directory Administrator.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerAzureADAdministratorInner> createOrUpdateAsync(String resourceGroupName, String serverName, ServerAzureADAdministratorInner properties, final ServiceCallback<ServerAzureADAdministratorInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, properties), serviceCallback);
    }

    /**
     * Creates a new Server Active Directory Administrator or updates an existing server Active Directory Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param properties The required parameters for creating or updating an Active Directory Administrator.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServerAzureADAdministratorInner> createOrUpdateAsync(String resourceGroupName, String serverName, ServerAzureADAdministratorInner properties) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, properties).map(new Func1<ServiceResponse<ServerAzureADAdministratorInner>, ServerAzureADAdministratorInner>() {
            @Override
            public ServerAzureADAdministratorInner call(ServiceResponse<ServerAzureADAdministratorInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates a new Server Active Directory Administrator or updates an existing server Active Directory Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param properties The required parameters for creating or updating an Active Directory Administrator.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<ServerAzureADAdministratorInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String serverName, ServerAzureADAdministratorInner properties) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (properties == null) {
            throw new IllegalArgumentException("Parameter properties is required and cannot be null.");
        }
        Validator.validate(properties);
        final String administratorName = "activeDirectory";
        final String apiVersion = "2014-04-01";
        Observable<Response<ResponseBody>> observable = service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, serverName, administratorName, apiVersion, properties, this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPutOrPatchResultAsync(observable, new TypeToken<ServerAzureADAdministratorInner>() { }.getType());
    }

    /**
     * Creates a new Server Active Directory Administrator or updates an existing server Active Directory Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param properties The required parameters for creating or updating an Active Directory Administrator.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerAzureADAdministratorInner object if successful.
     */
    public ServerAzureADAdministratorInner beginCreateOrUpdate(String resourceGroupName, String serverName, ServerAzureADAdministratorInner properties) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, properties).toBlocking().single().body();
    }

    /**
     * Creates a new Server Active Directory Administrator or updates an existing server Active Directory Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param properties The required parameters for creating or updating an Active Directory Administrator.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerAzureADAdministratorInner> beginCreateOrUpdateAsync(String resourceGroupName, String serverName, ServerAzureADAdministratorInner properties, final ServiceCallback<ServerAzureADAdministratorInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, properties), serviceCallback);
    }

    /**
     * Creates a new Server Active Directory Administrator or updates an existing server Active Directory Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param properties The required parameters for creating or updating an Active Directory Administrator.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerAzureADAdministratorInner object
     */
    public Observable<ServerAzureADAdministratorInner> beginCreateOrUpdateAsync(String resourceGroupName, String serverName, ServerAzureADAdministratorInner properties) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, properties).map(new Func1<ServiceResponse<ServerAzureADAdministratorInner>, ServerAzureADAdministratorInner>() {
            @Override
            public ServerAzureADAdministratorInner call(ServiceResponse<ServerAzureADAdministratorInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates a new Server Active Directory Administrator or updates an existing server Active Directory Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param properties The required parameters for creating or updating an Active Directory Administrator.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerAzureADAdministratorInner object
     */
    public Observable<ServiceResponse<ServerAzureADAdministratorInner>> beginCreateOrUpdateWithServiceResponseAsync(String resourceGroupName, String serverName, ServerAzureADAdministratorInner properties) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (properties == null) {
            throw new IllegalArgumentException("Parameter properties is required and cannot be null.");
        }
        Validator.validate(properties);
        final String administratorName = "activeDirectory";
        final String apiVersion = "2014-04-01";
        return service.beginCreateOrUpdate(this.client.subscriptionId(), resourceGroupName, serverName, administratorName, apiVersion, properties, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerAzureADAdministratorInner>>>() {
                @Override
                public Observable<ServiceResponse<ServerAzureADAdministratorInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerAzureADAdministratorInner> clientResponse = beginCreateOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServerAzureADAdministratorInner> beginCreateOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ServerAzureADAdministratorInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ServerAzureADAdministratorInner>() { }.getType())
                .register(201, new TypeToken<ServerAzureADAdministratorInner>() { }.getType())
                .register(202, new TypeToken<ServerAzureADAdministratorInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes an existing server Active Directory Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerAzureADAdministratorInner object if successful.
     */
    public ServerAzureADAdministratorInner delete(String resourceGroupName, String serverName) {
        return deleteWithServiceResponseAsync(resourceGroupName, serverName).toBlocking().last().body();
    }

    /**
     * Deletes an existing server Active Directory Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerAzureADAdministratorInner> deleteAsync(String resourceGroupName, String serverName, final ServiceCallback<ServerAzureADAdministratorInner> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, serverName), serviceCallback);
    }

    /**
     * Deletes an existing server Active Directory Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServerAzureADAdministratorInner> deleteAsync(String resourceGroupName, String serverName) {
        return deleteWithServiceResponseAsync(resourceGroupName, serverName).map(new Func1<ServiceResponse<ServerAzureADAdministratorInner>, ServerAzureADAdministratorInner>() {
            @Override
            public ServerAzureADAdministratorInner call(ServiceResponse<ServerAzureADAdministratorInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes an existing server Active Directory Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<ServerAzureADAdministratorInner>> deleteWithServiceResponseAsync(String resourceGroupName, String serverName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        final String administratorName = "activeDirectory";
        final String apiVersion = "2014-04-01";
        Observable<Response<ResponseBody>> observable = service.delete(this.client.subscriptionId(), resourceGroupName, serverName, administratorName, apiVersion, this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new TypeToken<ServerAzureADAdministratorInner>() { }.getType());
    }

    /**
     * Deletes an existing server Active Directory Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerAzureADAdministratorInner object if successful.
     */
    public ServerAzureADAdministratorInner beginDelete(String resourceGroupName, String serverName) {
        return beginDeleteWithServiceResponseAsync(resourceGroupName, serverName).toBlocking().single().body();
    }

    /**
     * Deletes an existing server Active Directory Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerAzureADAdministratorInner> beginDeleteAsync(String resourceGroupName, String serverName, final ServiceCallback<ServerAzureADAdministratorInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginDeleteWithServiceResponseAsync(resourceGroupName, serverName), serviceCallback);
    }

    /**
     * Deletes an existing server Active Directory Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerAzureADAdministratorInner object
     */
    public Observable<ServerAzureADAdministratorInner> beginDeleteAsync(String resourceGroupName, String serverName) {
        return beginDeleteWithServiceResponseAsync(resourceGroupName, serverName).map(new Func1<ServiceResponse<ServerAzureADAdministratorInner>, ServerAzureADAdministratorInner>() {
            @Override
            public ServerAzureADAdministratorInner call(ServiceResponse<ServerAzureADAdministratorInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes an existing server Active Directory Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerAzureADAdministratorInner object
     */
    public Observable<ServiceResponse<ServerAzureADAdministratorInner>> beginDeleteWithServiceResponseAsync(String resourceGroupName, String serverName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        final String administratorName = "activeDirectory";
        final String apiVersion = "2014-04-01";
        return service.beginDelete(this.client.subscriptionId(), resourceGroupName, serverName, administratorName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerAzureADAdministratorInner>>>() {
                @Override
                public Observable<ServiceResponse<ServerAzureADAdministratorInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerAzureADAdministratorInner> clientResponse = beginDeleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServerAzureADAdministratorInner> beginDeleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ServerAzureADAdministratorInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(202, new TypeToken<ServerAzureADAdministratorInner>() { }.getType())
                .register(204, new TypeToken<ServerAzureADAdministratorInner>() { }.getType())
                .register(200, new TypeToken<ServerAzureADAdministratorInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Returns an server Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerAzureADAdministratorInner object if successful.
     */
    public ServerAzureADAdministratorInner get(String resourceGroupName, String serverName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName).toBlocking().single().body();
    }

    /**
     * Returns an server Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerAzureADAdministratorInner> getAsync(String resourceGroupName, String serverName, final ServiceCallback<ServerAzureADAdministratorInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, serverName), serviceCallback);
    }

    /**
     * Returns an server Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerAzureADAdministratorInner object
     */
    public Observable<ServerAzureADAdministratorInner> getAsync(String resourceGroupName, String serverName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName).map(new Func1<ServiceResponse<ServerAzureADAdministratorInner>, ServerAzureADAdministratorInner>() {
            @Override
            public ServerAzureADAdministratorInner call(ServiceResponse<ServerAzureADAdministratorInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Returns an server Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerAzureADAdministratorInner object
     */
    public Observable<ServiceResponse<ServerAzureADAdministratorInner>> getWithServiceResponseAsync(String resourceGroupName, String serverName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        final String administratorName = "activeDirectory";
        final String apiVersion = "2014-04-01";
        return service.get(this.client.subscriptionId(), resourceGroupName, serverName, administratorName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerAzureADAdministratorInner>>>() {
                @Override
                public Observable<ServiceResponse<ServerAzureADAdministratorInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerAzureADAdministratorInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServerAzureADAdministratorInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ServerAzureADAdministratorInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ServerAzureADAdministratorInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Returns a list of server Administrators.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;ServerAzureADAdministratorInner&gt; object if successful.
     */
    public List<ServerAzureADAdministratorInner> listByServer(String resourceGroupName, String serverName) {
        return listByServerWithServiceResponseAsync(resourceGroupName, serverName).toBlocking().single().body();
    }

    /**
     * Returns a list of server Administrators.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ServerAzureADAdministratorInner>> listByServerAsync(String resourceGroupName, String serverName, final ServiceCallback<List<ServerAzureADAdministratorInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listByServerWithServiceResponseAsync(resourceGroupName, serverName), serviceCallback);
    }

    /**
     * Returns a list of server Administrators.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ServerAzureADAdministratorInner&gt; object
     */
    public Observable<List<ServerAzureADAdministratorInner>> listByServerAsync(String resourceGroupName, String serverName) {
        return listByServerWithServiceResponseAsync(resourceGroupName, serverName).map(new Func1<ServiceResponse<List<ServerAzureADAdministratorInner>>, List<ServerAzureADAdministratorInner>>() {
            @Override
            public List<ServerAzureADAdministratorInner> call(ServiceResponse<List<ServerAzureADAdministratorInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Returns a list of server Administrators.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ServerAzureADAdministratorInner&gt; object
     */
    public Observable<ServiceResponse<List<ServerAzureADAdministratorInner>>> listByServerWithServiceResponseAsync(String resourceGroupName, String serverName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        final String apiVersion = "2014-04-01";
        return service.listByServer(this.client.subscriptionId(), resourceGroupName, serverName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<ServerAzureADAdministratorInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<ServerAzureADAdministratorInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ServerAzureADAdministratorInner>> result = listByServerDelegate(response);
                        ServiceResponse<List<ServerAzureADAdministratorInner>> clientResponse = new ServiceResponse<List<ServerAzureADAdministratorInner>>(result.body().items(), result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ServerAzureADAdministratorInner>> listByServerDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ServerAzureADAdministratorInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ServerAzureADAdministratorInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
