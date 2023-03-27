package main.repository.request;

import main.model.request.RequestFactory;
import main.model.request.Request;
import main.model.request.RequestType;
import main.repository.Repository;
import main.utils.config.Location;

import java.util.List;
import java.util.Map;

public class RequestRepository extends Repository<Request> {
    public static RequestRepository getInstance() {
        return new RequestRepository();
    }

    RequestRepository() {
        super();
        load();
    }

    private static final String FILE_PATH = "/data/request/request.txt";

    @Override
    public String getFilePath() {
        return Location.LOCATION + FILE_PATH;
    }

    /**
     * Sets the list of mappable objects.
     *
     * @param listOfMappableObjects the list of mappable objects
     */
    @Override
    public void setAll(List<Map<String, String>> listOfMappableObjects) {
        List<Request> requests = getAll();
        for (Map<String, String> map : listOfMappableObjects) {
            Request request = RequestFactory.createRequest(map);
            requests.add(request);
        }
    }
}
