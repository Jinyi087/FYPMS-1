package main.model.request;

import main.model.Model;
import main.repository.request.RequestRepository;

import java.util.Map;

public abstract class Request extends Model {
    /**
     * The status of the request.
     */
    private RequestStatus status;
    /**
     * The ID of the request.
     */
    private final String requestID;

    /**
     * The constructor of the request.
     */
    public Request(String requestID) {
        this.requestID = requestID;
        this.status = RequestStatus.PENDING;
    }

    /**
     * Get the ID of the request.
     */
    public String getID() {
        return requestID;
    }

    /**
     * Get the status of the request.
     * @return the status of the request.
     */
    public RequestStatus getStatus() {
        return status;
    }

    /**
     * Set the status of the request.
     * @param status the status of the request.
     */
    public void setStatus(RequestStatus status) {
        this.status = status;
    }

    /**
     * Display the request.
     */
    public void displayRequest() {
        System.out.println("Request ID: " + requestID);
        System.out.println("Request Status: " + status);
    }
}
