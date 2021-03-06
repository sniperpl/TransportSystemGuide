package pl.rosiakit.bo;

import pl.rosiakit.model.Line;
import pl.rosiakit.model.Route;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Arkadiusz Rosiak (http://www.rosiak.it)
 * @date 2016-09-19
 */
public interface RouteBo {

    Map<Integer, List<Route>> findLineRoutesSplitByDirection(Line line);

    List<Route> findLineRoutes(Line line);

    void saveLineRoute(Route route);

    void saveAllLineRoutes(LinkedList<Route> routes);

    void delete(Route route);

    void deleteLineRoutes(Line line);

}
