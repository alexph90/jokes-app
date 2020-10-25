package alexph90.springframework.jokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public interface JokeService {
    String getJoke();
}
